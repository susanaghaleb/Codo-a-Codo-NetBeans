package numerosromanos;


public class NumerosRomanos {

    public String convertirANumerosRomanos(int algo) {
        int num, miles, cientos, decenas, unidades;
        String romano = "";

        miles = algo / 1000;
        cientos = algo / 100 - miles * 10;
        decenas = algo / 10 - miles * 100 - cientos * 10;
        unidades = algo % 10;

        for (num = 1; num <= miles; num++) {
            romano = romano + "M";
        }

        if (cientos == 9) {
            romano = romano + "CM";
        } else if (cientos >= 5) {
            romano = romano + "D";
            for (num = 6; num <= cientos; num++) {
                romano = romano + "C";
            }
        } else if (cientos == 4) {
            romano = romano + "CD";
        } else {
            for (num = 1; num <= cientos; num++) {
                romano = romano + "C";
            }
        }

        if (decenas == 9) {
            romano = romano + "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
            for (num = 6; num <= decenas; num++) {
                romano = romano + "X";
            }
        } else if (decenas == 4) {
            romano = romano + "XL";
        } else {
            for (num = 1; num <= decenas; num++) {
                romano = romano + "X";
            }
        }
        switch (unidades) {
            case 1:
                romano += "I";
                break;
            case 2:
                romano += "II";
                break;
            case 3:
                romano += "III";
                break;
            case 4:
                romano += "IV";
                break;
            case 5:
                romano += "V";
                break;
            case 6:
                romano += "VI";
                break;
            case 7:
                romano += "VII";
                break;
            case 8:
                romano += "VIII";
                break;
            case 9:
                romano += "IX";
                break;
        }
        return romano;
    }

}
