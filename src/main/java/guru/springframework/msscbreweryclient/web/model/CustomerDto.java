package guru.springframework.msscbreweryclient.web.model;

/**
 * Created by jt on 2019-04-21.
 */
public class CustomerDto {

    private Integer id;
    private String customerName;

    public CustomerDto(Integer id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public CustomerDto() {
    }

    public static CustomerDtoBuilder builder() {
        return new CustomerDtoBuilder();
    }

    public Integer getId() {
        return this.id;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CustomerDto)) return false;
        final CustomerDto other = (CustomerDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$customerName = this.getCustomerName();
        final Object other$customerName = other.getCustomerName();
        if (this$customerName == null ? other$customerName != null : !this$customerName.equals(other$customerName))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CustomerDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $customerName = this.getCustomerName();
        result = result * PRIME + ($customerName == null ? 43 : $customerName.hashCode());
        return result;
    }

    public String toString() {
        return "CustomerDto(id=" + this.getId() + ", customerName=" + this.getCustomerName() + ")";
    }

    public static class CustomerDtoBuilder {
        private Integer id;
        private String customerName;

        CustomerDtoBuilder() {
        }

        public CustomerDtoBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public CustomerDtoBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerDto build() {
            return new CustomerDto(id, customerName);
        }

        public String toString() {
            return "CustomerDto.CustomerDtoBuilder(id=" + this.id + ", customerName=" + this.customerName + ")";
        }
    }
}
