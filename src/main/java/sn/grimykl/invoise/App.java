package sn.grimykl.invoise;

import sn.grimykl.invoise.entity.Invoice;
import sn.grimykl.invoise.entity.Movie;
import sn.grimykl.invoise.service.InvoiceService;
import sn.grimykl.invoise.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String next = "";
        /*do {
            System.out.println( "What is the customer name?" );
            Scanner sc = new Scanner(System.in);
            String customerName = sc.nextLine();
            Invoice invoice = new Invoice();
            invoice.setCustomerName(customerName);
            InvoiceService invoiceService = new InvoiceService();
            invoiceService.createInvoice(invoice);
            System.out.println( "Do you want to create another one? Y/N" );
            sc = new Scanner(System.in);
            next = sc.nextLine();
        } while (next.equalsIgnoreCase("Y"));*/

        do {
            System.out.println( "What is the movie title?" );
            Scanner sc = new Scanner(System.in);
            String title = sc.nextLine();
            System.out.println( "What is the total number?" );
            sc = new Scanner(System.in);
            int totalNumber = sc.nextInt();
            System.out.println( "What is the movie type?" );
            sc = new Scanner(System.in);
            String type = sc.nextLine();
            System.out.println( "What is the movie main actor?" );
            sc = new Scanner(System.in);
            String mainActor = sc.nextLine();
            Movie movie = new Movie(title, totalNumber, type, mainActor);
            MovieService movieService = new MovieService();
            movieService.registerMovie(movie);
            System.out.println( "Do you want to add another movie? Y/N" );
            sc = new Scanner(System.in);
            next = sc.nextLine();
        } while (next.equalsIgnoreCase("Y"));

    }
}
