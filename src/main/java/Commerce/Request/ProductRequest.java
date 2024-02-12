package Commerce.Request;

public class ProductRequest {
    private Long id;
    private String productName;
    private String productCode;
    private Long availableUnits;
    private String[] availableColor;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(Long availableUnits) {
        this.availableUnits = availableUnits;
    }

    public String[] getAvailableColor() {
        return availableColor;
    }

    public void setAvailableColor(String[] availableColor) {
        this.availableColor = availableColor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
