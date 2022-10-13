package com.studyopedia;
import java.sql.*;

//import static jdk.nashorn.internal.objects.NativeSet.values;

public class Add {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            if (con != null)
                System.out.println("Connected");
            else
                System.out.println("not connected");
            String q1="INSERT INTO student.student(studentID,name,age) values (?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(q1);
            pstmt.setString(1,"108");
            pstmt.setString(2,"rakesh");
            pstmt.setString(3,"12");
            pstmt.execute();
            String q2="DELETE FROM student.student where studentID=107";
            PreparedStatement pstmt1=con.prepareStatement(q2);
            int x= pstmt.executeUpdate(q1);
            if(x>0)
                System.out.println("Insert successful");
            else
                System.out.println("Insert not successful");
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}


