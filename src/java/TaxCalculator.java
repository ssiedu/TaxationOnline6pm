
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TaxCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        //step-1 (reads the request)
        String s1=request.getParameter("t1");
        String s2=request.getParameter("t2");
        
        //step-2 (processes the request)
        int tax=0;
        int income=Integer.parseInt(s1);
        int age=Integer.parseInt(s2);
        if(income>=500000){
            tax=income*20/100;
        }else{
            tax=income*10/100;
        }
        if(age>=60){
            tax=tax-(tax*10/100);
        }
        //step-3 (provides the response)
        PrintWriter out=response.getWriter();
        out.println("Thanks For Visiting Us.");
        out.println("Your Tax Liability Is  : "+tax);
        out.println("Pay Your Taxes Before 31st March");
        out.close();
    }

    

}
