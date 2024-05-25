package document;

import java.util.Objects;

public class Lines {
    private Long lineNo;
    private Long Type;
    private String no;
    private Long quantity;
    private Double unitPrice;

    public Lines(Long lineNo, Long type, String no, Long quantity, Double unitPrice) {
        this.lineNo = lineNo;
        Type = type;
        this.no = no;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Lines() {
    }

    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long lineNo) {
        this.lineNo = lineNo;
    }

    public Long getType() {
        return Type;
    }

    public void setType(Long type) {
        Type = type;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lines lines = (Lines) o;
        return Objects.equals(lineNo, lines.lineNo) && Objects.equals(Type, lines.Type) && Objects.equals(no, lines.no) && Objects.equals(quantity, lines.quantity) && Objects.equals(unitPrice, lines.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineNo, Type, no, quantity, unitPrice);
    }

    @Override
    public String toString() {
        return "Lines{" +
                "lineNo=" + lineNo +
                ", Type=" + Type +
                ", no='" + no + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
