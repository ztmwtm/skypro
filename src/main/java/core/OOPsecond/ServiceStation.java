package core.OOPsecond;

public class ServiceStation {
    public void wheelsTransportService(WheelsTransport wheelsTransport) {
        System.out.println("Обслуживаем " + wheelsTransport.getModelName());
        wheelsTransport.check();
    }
}
