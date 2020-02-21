package contactADT;

public interface ContactADT<E>{
    E add();
    E view();
    E search();
    E delete();
}
