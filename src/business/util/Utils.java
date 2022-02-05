/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.util;

import business.DB40Util.DB4OUtil;
import business.EcoSystem;
import business.customer.Customer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import ui.HomePage;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.swing.JOptionPane;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author ashis
 */
public class Utils
{
    public static JFrame mainJFrame;
    public static EcoSystem ecoSystem;

    private Utils(JFrame mainJFrame) {
        this.mainJFrame = mainJFrame;
    }
    
    
    public static void previosPage(JPanel jPanel)
    {
        mainJFrame.setContentPane(jPanel);
        mainJFrame.revalidate();
        mainJFrame.repaint();
    }
    
    public static void logout()
    {
        DB4OUtil dB4OUtil = DB4OUtil.getInstance();
        dB4OUtil.storeSystem(ecoSystem);
        HomePage newMainJFrame = new HomePage();
        newMainJFrame.setVisible(true);
        mainJFrame.dispose();
        return;
    }
    
    public static void newPage(JPanel jPanel)
    {
        mainJFrame.setContentPane(jPanel);
        mainJFrame.revalidate();
        mainJFrame.repaint();
    }
    
    public static void downloadTicket(String bookingDate, String departureAirport, String arrivalAirport, String flightDate, 
            String flightTime, String totalHours, String flightNo, String seatNo, String departureTerminal, String arrivalTerminal
            ) throws IOException
    {
        OutputStream file = null;
        try {
            file = new FileOutputStream(new File("Ticket.pdf"));
            Font bold = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            bold.setColor(new BaseColor(0,0,255));
            Font regular = new Font(Font.FontFamily.HELVETICA, 16, Font.ITALIC);
            regular.setColor(new BaseColor(0,191,255));

            // Create a new Document object
            Document document = new Document();
 
            // You need PdfWriter to generate PDF document
            PdfWriter.getInstance(document, file);
 
            // Opening document for writing PDF
            document.open();
          
            //display image and text beside each other Itext\
            String img = "src/Images/logo.png"; 
            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setWidths(new int[]{1, 2});
            table.addCell(createImageCell(img));
            table.addCell(createHeadlineCell("Plane Ticket"));
            document.add(table);
            
            // Writing content
            Paragraph BookingDate = new Paragraph("Booking Date", regular);
            BookingDate.setSpacingBefore(25);
            BookingDate.setAlignment(Element.ALIGN_LEFT);
            document.add(BookingDate);
            document.add(new Paragraph(bookingDate));
//            document.add(new Paragraph(new Date(new java.util.Date().getTime()).toString()));
            
            Paragraph FlightDetails = new Paragraph("Flight Details", regular);
            FlightDetails.setSpacingBefore(25);
            document.add(FlightDetails);
            
            PdfPTable flightDetailHeadline = new PdfPTable(2);
            flightDetailHeadline.setWidthPercentage(100);
            flightDetailHeadline.setWidths(new int[]{1, 1});
            flightDetailHeadline.addCell(createTextCellBold("From"));
            flightDetailHeadline.addCell(createTextCellBold("Airline"));
            document.add(flightDetailHeadline);
            
            PdfPTable flightDetail = new PdfPTable(2);
            flightDetail.setWidthPercentage(100);
            flightDetail.setWidths(new int[]{1, 1});
            flightDetail.addCell(createTextCell(departureAirport));
            flightDetail.addCell(createTextCell(arrivalAirport));
            document.add(flightDetail);
            
            PdfPTable flightDetailHeadline1 = new PdfPTable(2);
            flightDetailHeadline1.setWidthPercentage(100);
            flightDetailHeadline1.setWidths(new int[]{1, 1});
            flightDetailHeadline1.addCell(createTextCellBold("Departure Date"));
            flightDetailHeadline1.addCell(createTextCellBold("Arrival Date"));
            document.add(flightDetailHeadline1);
            
            PdfPTable flightDetail1 = new PdfPTable(2);
            flightDetail1.setWidthPercentage(100);
            flightDetail1.setWidths(new int[]{1, 1});
            flightDetail1.addCell(createTextCell("2 Dec, 2021"));
            flightDetail1.addCell(createTextCell("4 Dec, 2021"));
            document.add(flightDetail1);
            
            
            PdfPTable flightDetailHeadline2 = new PdfPTable(2);
            flightDetailHeadline2.setWidthPercentage(100);
            flightDetailHeadline2.setWidths(new int[]{1, 1});
            flightDetailHeadline2.addCell(createTextCellBold("To"));
            flightDetailHeadline2.addCell(createTextCellBold("Flight Number"));
            document.add(flightDetailHeadline2);
            
            PdfPTable flightDetail2 = new PdfPTable(2);
            flightDetail2.setWidthPercentage(100);
            flightDetail2.setWidths(new int[]{1, 1});
            flightDetail2.addCell(createTextCell("Mumbai"));
            flightDetail2.addCell(createTextCell("#12345"));
            document.add(flightDetail2);
            
            PdfPTable flightDetailHeadline3 = new PdfPTable(2);
            flightDetailHeadline3.setWidthPercentage(100);
            flightDetailHeadline3.setWidths(new int[]{1, 1});
            flightDetailHeadline3.addCell(createTextCellBold("Departure Terminal"));
            flightDetailHeadline3.addCell(createTextCellBold("Arrival Terminal"));
            document.add(flightDetailHeadline3);
            
            PdfPTable flightDetail3 = new PdfPTable(2);
            flightDetail3.setWidthPercentage(100);
            flightDetail3.setWidths(new int[]{1, 1});
            flightDetail3.addCell(createTextCell(departureTerminal));
            flightDetail3.addCell(createTextCell(arrivalTerminal));
            document.add(flightDetail3);
            
            PdfPTable flightDetailHeadline4 = new PdfPTable(2);
            flightDetailHeadline4.setWidthPercentage(100);
            flightDetailHeadline4.setWidths(new int[]{1, 1});
            flightDetailHeadline4.addCell(createTextCellBold("Baggage Allowance"));
            flightDetailHeadline4.addCell(createTextCellBold("Seat Number"));
            document.add(flightDetailHeadline4);
            
            PdfPTable flightDetail4 = new PdfPTable(2);
            flightDetail4.setWidthPercentage(100);
            flightDetail4.setWidths(new int[]{1, 1});
            flightDetail4.addCell(createTextCell("2"));
            flightDetail4.addCell(createTextCell(seatNo));
            document.add(flightDetail4);       
 
            // Add meta data information to PDF file
            document.addCreationDate();
            document.addAuthor("Airplane Ecosystem");
            document.addTitle("Airplane Ticket");
            document.addCreator("Shreya");
 
 
            // close the document
            document.close();
 
            System.out.println("Your PDF File is succesfully created");
 
        } catch (Exception e) {
            e.printStackTrace();
 
        } finally {
 
            // closing FileOutputStream
            if (file != null) {
                file.close();
            } /*Failed to close*/
 
        }
}
    public static PdfPCell createTextCellBold(String text) throws DocumentException, IOException {
    PdfPCell cell = new PdfPCell();
    Font regular = new Font(Font.FontFamily.HELVETICA, 16, Font.ITALIC);
    regular.setColor(new BaseColor(0,191,255));
    Paragraph p = new Paragraph(text, regular);
    p.setSpacingBefore(200);
    p.setAlignment(Element.ALIGN_LEFT);
    cell.addElement(p);
    cell.setVerticalAlignment(Element.ALIGN_BOTTOM);
    cell.setBorder(Rectangle.NO_BORDER);
    return cell;
}
    public static PdfPCell createHeadlineCell(String text) throws DocumentException, IOException {
        PdfPCell cell = new PdfPCell();
        Font bold = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
        bold.setColor(new BaseColor(0,0,255));
        Paragraph p = new Paragraph(text, bold);
        p.setSpacingAfter(25);
        p.setAlignment(Element.ALIGN_CENTER);
        cell.addElement(p);
        cell.setVerticalAlignment(Element.ALIGN_BOTTOM);
        cell.setBorder(Rectangle.NO_BORDER);
        return cell;
}
    public static PdfPCell createImageCell(String path) throws DocumentException, IOException {
        Image img = Image.getInstance(path);
        PdfPCell cell = new PdfPCell(img, true);
        cell.setBorder(Rectangle.NO_BORDER);
    return cell;
    }
    
    public static PdfPCell createTextCell(String text) throws DocumentException, IOException {
        PdfPCell cell = new PdfPCell();
        Paragraph p = new Paragraph(text);
        p.setSpacingAfter(25);
        p.setAlignment(Element.ALIGN_LEFT);
        cell.addElement(p);
        cell.setVerticalAlignment(Element.ALIGN_BOTTOM);
        cell.setBorder(Rectangle.NO_BORDER);
        return cell;
}
    
    public static void emailTicket(String email){
        // Mail Service
        File f1 = new File("Ticket.pdf");
        try{
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            Session session;
            session = Session.getDefaultInstance(properties, new Authenticator(){
                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("airportecosystem@gmail.com","airport@123");
                }
                
            });
            
            Message message = new MimeMessage(session);
            message.setSubject("Ticket");
            message.setFrom(new InternetAddress("airportecosystem@gmail.com"));
            message.setRecipient(RecipientType.TO,new InternetAddress(email));
            message.setSentDate(new Date());
            
            // Attachments
            Multipart multipart = new MimeMultipart();
            
            //Content
            BodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText("Thank You for choosing for Airline, Please find the attached ticket.");
            multipart.addBodyPart(bodyPart);
            
            //Files
            DataSource dataSource = new FileDataSource(f1);
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setDataHandler(new DataHandler(dataSource));
            mimeBodyPart.setFileName(f1.getName());
            multipart.addBodyPart(mimeBodyPart);
            
            message.setContent(multipart);
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Mail Sent");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
    }
    }
}
