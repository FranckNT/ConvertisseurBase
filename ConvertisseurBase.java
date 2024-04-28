
public class ConvertisseurBase? {

      public static String convertBase(String number, int baseFrom, int baseTO) {
          try {
              int decimalNumber = Integer.parseInt(number, baseFrom);
              String convertedNUmber = ; if (baseTo == 2) { convertedNumber = 
Integer.toBInaryString(decimalNumber); } else if (baseTo == 10) { convertedNumber = 
String.valueOf(decimalNumber); } else if (baseTo == 16) { convertedNumber = 
Integer.toHexString(decimalNumber); } else { System.out.printIn("Base d'arrivée invalide. ");
return ; 
          }
          return convertedNumber;
      } catch (NumberFormatException? e) {
          System.out.printIn("Nombre invalide pour la base de départ. ");
          return ; } } public static void main(String[] args) { Scanner scanner = new
Scanner(System.in); System.out.print("Entrez le nombre à convertir : "); String number =
scanner.nextLine(); System.out.print("Entrez la base de départ (2 pour binaire, 10 pour décimal, 16
d'arrivée (2 pour binaire, 10 pour décimal, 16 pour héxadécimal) : "); int baseTo = 
scanner.nextInt(); String convertedNumber = convertBase(number, baseFrom, baseTo);
System.out.printIn("Le nombre converti est : " + convertedNumber); scanner.close(); } }
