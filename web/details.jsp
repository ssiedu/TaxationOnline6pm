<html>
    <body>
        <h3>Details-Submission-Form</h3>
        <hr>
        <form action="TaxCalculator" method="get">   
            <pre>
            PAN-NO  <input type="password" name="pn"/>
            Income  <input type="text" name="t1"/>
            BDate   <input type="date" name="dt"/>
            Source  Salary      <input type="radio" name="r1" value="salary" checked="checked"/>  
                    Business    <input type="radio" name="r1" value="business"/>  
            Age     <input type="text" name="t2"/>
            NRI     <input type="checkbox" name="c1" value="yes"/>
            City    <select name="city">
                        <option>Bhopal</option>
                        <option>Chennai</option>
                        <option>Delhi</option>
                        <option>Indore</option>    
                    </select>
            Assets  <select name="assets" multiple="multiple">
                    <option>Car</option>
                    <option>Flat</option>
                    <option>Gold</option>
                    <option>Diamonds</option>
                    <option>Stocks</option>
                    <option>Plot</option>
                    </select>
            JobDesc <textarea rows="5" cols="20" name="ta"></textarea>
                    <input type="submit" value="FindTax"/>
                    <input type="reset" value="Reset"/>
            </pre>
        </form>
        <hr>
    </body>
</html>
