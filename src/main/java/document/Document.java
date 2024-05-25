package document;

import java.util.List;
import java.util.Objects;

public class Document {
    private Long DocumentType;
    private  String No;
    private  String SellToCustNo;
    private  String PostingDate;
    private List<Lines> Lines;


    public Document(Long documentType, String no, String sellToCustNo, String postingDate, List<document.Lines> lines) {
        this.DocumentType = documentType;
        this.No = no;
        this.SellToCustNo = sellToCustNo;
        this.PostingDate = postingDate;
        this.Lines = lines;
    }

    public Document() {
    }

    public Long getDocumentType() {
        return DocumentType;
    }

    public void setDocumentType(Long documentType) {
        DocumentType = documentType;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getSellToCustNo() {
        return SellToCustNo;
    }

    public void setSellToCustNo(String sellToCustNo) {
        SellToCustNo = sellToCustNo;
    }

    public String getPostingDate() {
        return PostingDate;
    }

    public void setPostingDate(String postingDate) {
        PostingDate = postingDate;
    }

    public List<document.Lines> getLines() {
        return Lines;
    }

    public void setLines(List<document.Lines> lines) {
        Lines = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(DocumentType, document.DocumentType) && Objects.equals(No, document.No) && Objects.equals(SellToCustNo, document.SellToCustNo) && Objects.equals(PostingDate, document.PostingDate) && Objects.equals(Lines, document.Lines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DocumentType, No, SellToCustNo, PostingDate, Lines);
    }

    @Override
    public String toString() {
        return "Document{" +
                "DocumentType=" + DocumentType +
                ", No='" + No + '\'' +
                ", SellToCustNo='" + SellToCustNo + '\'' +
                ", PostingDate='" + PostingDate + '\'' +
                ", Lines=" + Lines +
                '}';
    }
}
