//package C09Networking;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.nio.charset.StandardCharsets;
//import java.sql.*;
//import java.util.Arrays;
//
//public class C0904WebServer3 {
//    public static void main(String[] args) throws IOException, SQLException {
////        소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝 점을 나타내는 개념
//        ServerSocket serverSocket = new ServerSocket(8081);
//        while (true) {
////            accept(): 클라이언트의 연결 요청을 수락
//            Socket socket = serverSocket.accept();
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            StringBuilder sb = new StringBuilder();
//            String line;
//            while( (line = br.readLine()) != null && !line.isEmpty() ) {
//                sb.append(line + "\n");
//            }
//            String requestString = sb.toString();
//            String firstLine = requestString.split("\n")[0];
//            String infos = firstLine.split(" ")[1];
//            int id = 0;
//            String name = "";
//            String email = "";
//            if (infos.contains("?")) {
//                String st1 = infos.split("\\?")[1];
//                String[] stArr = st1.split("&");
//                for (String s : stArr) {
//                    String[] keyValue = s.split("=");
//                    if (keyValue[0].equals("id")) {
//                         id = Integer.parseInt(keyValue[1]);
//                    }
//                    if (keyValue[0].equals("name")) {
//                        name = keyValue[1];
//                    }
//                    if (keyValue[0].equals("email")) {
//                        email = keyValue[1];
//                    }
//                }
//            }
//            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "Hello world";
////            UTF-8 문자열 return
//            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
////            플러시란 일반적으로 변경 사항을 확정(반영)하는 것을 의미
//            socket.getOutputStream().flush();
//            socket.close();
//
//            String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
//            String userName = "root";
//            String password = "1234";
//
//            Connection con = DriverManager.getConnection(url, userName, password);
//
//            Statement st = con.createStatement();
//            String myQuery = "SELECT * FROM Author";
//            ResultSet rs = st.executeQuery(myQuery);
//            while (rs.next()) {
//                id = rs.getInt("id");
//                name = rs.getString("name");
//                email = rs.getString("email");
//                System.out.println(id + " " + name + " " + email);
//            }
//
//        }
//    }
//}
