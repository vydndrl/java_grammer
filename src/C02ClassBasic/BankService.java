package C02ClassBasic;

import java.util.*;

public class BankService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> bankAccounts = new ArrayList<>();

        while (true) {
            System.out.println("어떤 서비스를 선택하시겠어요?");
            System.out.println("1. 계좌계설 | 2. 입금 | 3. 출금 | 4. 계좌 송금 | 5. 종료");
            int selMenu = Integer.parseInt(sc.nextLine());

            if (selMenu == 1) {
                System.out.println("개설 할 계좌의 계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                BankAccount bankAccount = new BankAccount(accountNumber);
                bankAccounts.add(bankAccount);
                continue;
            }
            if (selMenu == 2) {
                System.out.println("계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                System.out.println("입금할 금액을 입력해주세요.");
                int money = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                        bankAccounts.get(i).deposit(money);
                    }
                }
                continue;
            }
            if (selMenu == 3) {
                System.out.println("계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                System.out.println("출금할 금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                        bankAccounts.get(i).withdraw(money);
                    }
                }
                continue;
            }
            if (selMenu == 4) {
                System.out.println("본인 계좌번호를 입력해주세요");
                String myNumber = sc.nextLine();
                System.out.println("받는 분의 계좌번호를 입력해주세요.");
                String yourNumber = sc.nextLine();
                System.out.println("금액을 입력해주세요.");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount myAccount = null;
                BankAccount yourAccount = null;
                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAccountNumber().equals(myNumber)) {
                        myAccount = bankAccounts.get(i);
                    }
                    if (bankAccounts.get(i).getAccountNumber().equals(yourNumber)) {
                        yourAccount = bankAccounts.get(i);
                    }
                }
                myAccount.transfer(yourAccount, money);
            }
            if (selMenu == 5) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}

 class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit (int money) {
        System.out.println(money + "원 입금 되었습니다.");
        this.balance += money;
        System.out.println("잔액: " + getBalance());
    }

    public void withdraw (int money) {
        if (money > this.balance) {
            System.out.println("잔액이 부족합니다.");
            System.out.println("잔액: " + getBalance());
        } else {
            this.balance -= money;
            System.out.println(money + "원 출금되었습니다.");
            System.out.println("잔액: " + getBalance());
        }
    }

     public void transfer(BankAccount account, int money) {

        if (money > this.balance) {
            System.out.println("잔액이 부족합니다.");
            System.out.println("잔액: " + getBalance());
        } else {
            this.balance -= money;
            account.deposit(money);
            System.out.println(money + "원이 정상적으로 송금 되었습니다.");
            System.out.println("잔액: " + getBalance());
        }

     }


 }
