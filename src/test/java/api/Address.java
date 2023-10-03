//package api;
//
//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//
//@JsonDeserialize(as = Address.class)
//public class Address {
//    @JsonProperty("Present")
//    private String Present;
//    @JsonProperty("Warehouses")
//    private Integer Warehouses;
//    @JsonProperty("MainDescription")
//    private String MainDescription;
//    @JsonProperty("Area")
//    private String Area;
//    @JsonProperty("Region")
//    private String Region;
//    @JsonProperty("SettlementTypeCode")
//    private String SettlementTypeCode;
//    @JsonProperty("Ref")
//    private String Ref;
//    @JsonProperty("DeliveryCity")
//    private String DeliveryCity;
//    @JsonProperty("AddressDeliveryAllowed")
//    private Boolean AddressDeliveryAllowed;
//    @JsonProperty("StreetsAvailability")
//    private Boolean StreetsAvailability;
//    @JsonProperty("ParentRegionTypes")
//    private String ParentRegionTypes;
//    @JsonProperty("ParentRegionCode")
//    private String ParentRegionCode;
//    @JsonProperty("RegionTypes")
//    private String RegionTypes;
//    @JsonProperty("RegionTypesCode")
//    private String RegionTypesCode;
//
//    @JsonCreator
//    public Address(@JsonProperty("Present") String present, @JsonProperty("Warehouses") int warehouses, @JsonProperty("MainDescription") String mainDescription, @JsonProperty("Area") String area, @JsonProperty("Region") String region, @JsonProperty("SettlementTypeCode") String settlementTypeCode, @JsonProperty("Ref") String ref, @JsonProperty("DeliveryCity") String deliveryCity, @JsonProperty("AddressDeliveryAllowed") Boolean addressDeliveryAllowed, @JsonProperty("StreetsAvailability") Boolean streetsAvailability, @JsonProperty("ParentRegionTypes") String parentRegionTypes, @JsonProperty("ParentRegionCode") String parentRegionCode, @JsonProperty("RegionTypes") String regionTypes, @JsonProperty("RegionTypesCode") String regionTypesCode) {
//        this.Present = present;
//        this.Warehouses = warehouses;
//        this.MainDescription = mainDescription;
//        this.Area = area;
//        this.Region = region;
//        this.SettlementTypeCode = settlementTypeCode;
//        this.Ref = ref;
//        this.DeliveryCity = deliveryCity;
//        this.AddressDeliveryAllowed = addressDeliveryAllowed;
//        this.StreetsAvailability = streetsAvailability;
//        this.ParentRegionTypes = parentRegionTypes;
//        this.ParentRegionCode = parentRegionCode;
//        this.RegionTypes = regionTypes;
//        this.RegionTypesCode = regionTypesCode;
//    }
//
//    public String getPresent() {
//        return Present;
//    }
//    public void setPresent(String present) {
//        Present = present;
//    }
//
//    public Integer getWarehouses() {
//        return Warehouses;
//    }
//    public void setWarehouses(Integer warehouses) {
//        Warehouses = warehouses;
//    }
//
//    public String getMainDescription() {
//        return MainDescription;
//    }
//    public void setMainDescription(String mainDescription) {
//        MainDescription = mainDescription;
//    }
//
//    public String getArea() {
//        return Area;
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "Present='" + Present + '\'' +
//                ", Warehouses=" + Warehouses +
//                ", MainDescription='" + MainDescription + '\'' +
//                ", Area='" + Area + '\'' +
//                ", Region='" + Region + '\'' +
//                ", SettlementTypeCode='" + SettlementTypeCode + '\'' +
//                ", Ref='" + Ref + '\'' +
//                ", DeliveryCity='" + DeliveryCity + '\'' +
//                ", AddressDeliveryAllowed=" + AddressDeliveryAllowed +
//                ", StreetsAvailability=" + StreetsAvailability +
//                ", ParentRegionTypes='" + ParentRegionTypes + '\'' +
//                ", ParentRegionCode='" + ParentRegionCode + '\'' +
//                ", RegionTypes='" + RegionTypes + '\'' +
//                ", RegionTypesCode='" + RegionTypesCode + '\'' +
//                '}';
//    }
//}
//
//
//
