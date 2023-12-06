package wyswietlanie_liczb_for;

import java.io.*;
public class WyswietlanieLiczbFor {

    public static void main(String[] args)
        throws IOException
    {
        int i, a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.println("Podaj zakres poczatkowy (liczba): ");
            a = Integer.parseInt(br.readLine());
            System.out.println("Podaj zakres koncowy (liczba): ");
            b = Integer.parseInt(br.readLine());



            if(a<b)
            {
                System.out.println("liczby calkowite z podanego zakresu to: ");
                for (i = a; i <= b; i++)
                {
                    System.out.print(i + " ");
                }
            }
            else
            {
                    System.out.print("zakres koncowy nie moze byc mniejszy od poczatkowego ");
            }
        }
        catch(NumberFormatException exception)
        {
            System.out.println("nie poprawne dane, podaj liczby calkowite");
        }

    }
}
