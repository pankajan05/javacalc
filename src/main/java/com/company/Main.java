/*Authors: Pankajan(SE/2016/032)
            Dinindu(SE/2016/033)
             Hashika(SE/2016/012)
             Udith(SE/2016/047)
   Purpose: Assignment of Software Construction
   Function : read two numbers from the file and do calculation
 */

package com.company;



import com.company.Repository.FileNumberRepository;
import com.company.Repository.NumberRepository;
import com.company.factory.Factory;
import com.company.factory.ObjectOperationFactory;
import com.company.input.CMDLineInput;
import com.company.input.Inputs;
import com.company.operation.Operation;
import com.company.output.GuiOutput;
import com.company.output.Outputs;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        Inputs input = new CMDLineInput(args);
        String operator = input.read();

       NumberRepository numberRepository = new FileNumberRepository();
        List<Double> inputNumbers = numberRepository.read();


        Operation operation = null;

        Factory factoryobject = new ObjectOperationFactory(inputNumbers,operator);
        operation = factoryobject.getInstance();

        Outputs output = new GuiOutput();
        output.show("Answer for "+operator+" is: "+ operation.perform());

    }
}
