package br.edu.fateccarapicuiba;

import net.sourceforge.jFuzzyLogic.FIS;


public class TestTipper {
    public static void main(String[] args) throws Exception {
        // Load from 'FCL' file
        String fileName = "/home/nyxx13/example.fcl";
        FIS fis = FIS.load(fileName,true);
        // Error while loading?
        if( fis == null ) { 
            System.err.println("Can't load file: '" 
                                   + fileName + "'");
            return;
        }

        // Show 
        fis.chart();

        // Set inputs
        fis.setVariable("service", 3);
        fis.setVariable("food", 7);

        // Evaluate
        fis.evaluate();

        // Show output variable's chart 
        fis.getVariable("tip").chartDefuzzifier(true);

        // Print ruleSet
        System.out.println(fis);
    }
}
