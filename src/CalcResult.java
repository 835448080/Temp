public class CalcResult {
    private String flight;
    private Object data;
    private Long ts;

    public CalcResult() {
    }

    public String getFlight() {
        return this.flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTs() {
        return this.ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }
}