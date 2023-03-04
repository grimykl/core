package sn.grimykl.invoise.service;

import sn.grimykl.invoise.entity.Invoice;
import sn.grimykl.invoise.repository.InvoiceRepository;

public class InvoiceService {

    private static long lastNumber = 0L;
    private static InvoiceRepository invoiceRepository = new InvoiceRepository();

    public void createInvoice (Invoice invoice) {
        invoice.setNumber(Long.toString(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
