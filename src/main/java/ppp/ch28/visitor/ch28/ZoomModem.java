package ppp.ch28.visitor.ch28;

public class ZoomModem implements Modem {
    int configurationValue = 0;
    @Override
    public void dial(String pno) {
    }

    @Override
    public void hangup() {
    }

    @Override
    public void send(char c) {
    }

    @Override
    public char recv() {
        return 0;
    }

    @Override
    public void accept(ModemVisitor v) {
        v.visit(this);
    }
}
