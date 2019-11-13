
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
        String s3=request.getParameter("city");
        //String s4=request.getParameter("assets"); 
        String s[]=request.getParameterValues("assets");
        String s4=request.getParameter("c1");
        String s5=request.getParameter("r1");
        
        int ptax=0;
        if(s5.equals("salary")){
            ptax=2000;
        }else{
            ptax=3000;
        }
                
        
        int nriCharges=0;
        if(s4!=null){
            nriCharges=5000;
        }
        
        
        
        int wtax=0;
        if(s!=null){
            wtax=s.length*1000;
        }
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
        out.println("<html>");
        out.println("<body bgcolor=gray>");
        out.println("<h2>Income Tax Dept , "+s3+"</h2>");
        out.println("<hr>");
        out.println("<h3>Thanks For Visiting Us.<h3>");
        out.println("<table border=2>");
        out.println("<tr>");
        out.println("<td>Income</td>");
        out.println("<td>"+income+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Tax</td>");
        out.println("<td>"+tax+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>W.Tax</td>");
        out.println("<td>"+wtax+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>NRI.Tax</td>");
        out.println("<td>"+nriCharges+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>PR.Tax</td>");
        out.println("<td>"+ptax+"</td>");
        out.println("</tr>");
        
        out.println("</table>");
        out.println("<hr>");
        out.println("<marquee>Pay Your Taxes Before 31st March<marquee>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    

}
