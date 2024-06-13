import java.util.Date;
import java.util.Objects;

public class StationMngmnt {
    public static void main(String[] args) {
        class StationMngmt {

            private Long id;
            private String stationCode;
            private String stationName;
            private String stationFullName;
            private char principleFlag;
            private String hindiNameAsciiName;
            private String stnNameUtf;
            private Short mstZoneMasterId;
            private String zoneCode;
            private String gauge;
            private char displayFlag;
            private char stationStatusFlag;
            private char outStnFlag;
            private String hillStnFlag;
            private Short mstDivisionMasterId;
            private Short mstStateMasterId;
            private Short mstDistrictMasterId;
            private String tehshil;
            private String pincode;
            private String latLongCord;
            private String country;
            private Date validFrom;
            private Date validTo;

            public StationMngmt(Long id, String stationCode, String stationName, String stationFullName, char principleFlag, String hindiNameAsciiName, String stnNameUtf, Short mstZoneMasterId, String zoneCode, String gauge, char displayFlag, char stationStatusFlag, char outStnFlag, String hillStnFlag, Short mstDivisionMasterId, Short mstStateMasterId, Short mstDistrictMasterId, String tehshil, String pincode, String latLongCord, String country, Date validFrom, Date validTo) {
                this.id = id;
                this.stationCode = stationCode;
                this.stationName = stationName;
                this.stationFullName = stationFullName;
                this.principleFlag = principleFlag;
                this.hindiNameAsciiName = hindiNameAsciiName;
                this.stnNameUtf = stnNameUtf;
                this.mstZoneMasterId = mstZoneMasterId;
                this.zoneCode = zoneCode;
                this.gauge = gauge;
                this.displayFlag = displayFlag;
                this.stationStatusFlag = stationStatusFlag;
                this.outStnFlag = outStnFlag;
                this.hillStnFlag = hillStnFlag;
                this.mstDivisionMasterId = mstDivisionMasterId;
                this.mstStateMasterId = mstStateMasterId;
                this.mstDistrictMasterId = mstDistrictMasterId;
                this.tehshil = tehshil;
                this.pincode = pincode;
                this.latLongCord = latLongCord;
                this.country = country;
                this.validFrom = validFrom;
                this.validTo = validTo;
            }

            public Long getId() {
                return id;
            }

            public String getStationCode() {
                return stationCode;
            }

            public String getStationName() {
                return stationName;
            }

            public String getStationFullName() {
                return stationFullName;
            }

            public char getPrincipleFlag() {
                return principleFlag;
            }

            public String getHindiNameAsciiName() {
                return hindiNameAsciiName;
            }

            public String getStnNameUtf() {
                return stnNameUtf;
            }

            public Short getMstZoneMasterId() {
                return mstZoneMasterId;
            }

            public String getZoneCode() {
                return zoneCode;
            }

            public String getGauge() {
                return gauge;
            }

            public char getDisplayFlag() {
                return displayFlag;
            }

            public char getStationStatusFlag() {
                return stationStatusFlag;
            }

            public char getOutStnFlag() {
                return outStnFlag;
            }

            public String getHillStnFlag() {
                return hillStnFlag;
            }

            public Short getMstDivisionMasterId() {
                return mstDivisionMasterId;
            }

            public Short getMstStateMasterId() {
                return mstStateMasterId;
            }

            public Short getMstDistrictMasterId() {
                return mstDistrictMasterId;
            }

            public String getTehshil() {
                return tehshil;
            }

            public String getPincode() {
                return pincode;
            }

            public String getLatLongCord() {
                return latLongCord;
            }

            public String getCountry() {
                return country;
            }

            public Date getValidFrom() {
                return validFrom;
            }

            public Date getValidTo() {
                return validTo;
            }

            // Setters
            public void setId(Long id) {
                this.id = id;
            }

            public void setStationCode(String stationCode) {
                this.stationCode = stationCode;
            }

            public void setStationName(String stationName) {
                this.stationName = stationName;
            }

            public void setStationFullName(String stationFullName) {
                this.stationFullName = stationFullName;
            }

            public void setPrincipleFlag(char principleFlag) {
                this.principleFlag = principleFlag;
            }

            public void setHindiNameAsciiName(String hindiNameAsciiName) {
                this.hindiNameAsciiName = hindiNameAsciiName;
            }

            public void setStnNameUtf(String stnNameUtf) {
                this.stnNameUtf = stnNameUtf;
            }

            public void setMstZoneMasterId(Short mstZoneMasterId) {
                this.mstZoneMasterId = mstZoneMasterId;
            }

            public void setZoneCode(String zoneCode) {
                this.zoneCode = zoneCode;
            }

            public void setGauge(String gauge) {
                this.gauge = gauge;
            }

            public void setDisplayFlag(char displayFlag) {
                this.displayFlag = displayFlag;
            }

            public void setStationStatusFlag(char stationStatusFlag) {
                this.stationStatusFlag = stationStatusFlag;
            }

            public void setOutStnFlag(char outStnFlag) {
                this.outStnFlag = outStnFlag;
            }

            public void setHillStnFlag(String hillStnFlag) {
                this.hillStnFlag = hillStnFlag;
            }

            public void setMstDivisionMasterId(Short mstDivisionMasterId) {
                this.mstDivisionMasterId = mstDivisionMasterId;
            }

            public void setMstStateMasterId(Short mstStateMasterId) {
                this.mstStateMasterId = mstStateMasterId;
            }

            public void setMstDistrictMasterId(Short mstDistrictMasterId) {
                this.mstDistrictMasterId = mstDistrictMasterId;
            }

            public void setTehshil(String tehshil) {
                this.tehshil = tehshil;
            }

            public void setPincode(String pincode) {
                this.pincode = pincode;
            }

            public void setLatLongCord(String latLongCord) {
                this.latLongCord = latLongCord;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public void setValidFrom(Date validFrom) {
                this.validFrom = validFrom;
            }

            public void setValidTo(Date validTo) {
                this.validTo = validTo;
            }

            @Override
            public String toString() {
                return "StationMngmt{" +
                        "id=" + id +
                        ", stationCode='" + stationCode + '\'' +
                        ", stationName='" + stationName + '\'' +
                        ", stationFullName='" + stationFullName + '\'' +
                        ", principleFlag=" + principleFlag +
                        ", hindiNameAsciiName='" + hindiNameAsciiName + '\'' +
                        ", stnNameUtf='" + stnNameUtf + '\'' +
                        ", mstZoneMasterId=" + mstZoneMasterId +
                        ", zoneCode='" + zoneCode + '\'' +
                        ", gauge='" + gauge + '\'' +
                        ", displayFlag=" + displayFlag +
                        ", stationStatusFlag=" + stationStatusFlag +
                        ", outStnFlag=" + outStnFlag +
                        ", hillStnFlag='" + hillStnFlag + '\'' +
                        ", mstDivisionMasterId=" + mstDivisionMasterId +
                        ", mstStateMasterId=" + mstStateMasterId +
                        ", mstDistrictMasterId=" + mstDistrictMasterId +
                        ", tehshil='" + tehshil + '\'' +
                        ", pincode='" + pincode + '\'' +
                        ", latLongCord='" + latLongCord + '\'' +
                        ", country='" + country + '\'' +
                        ", validFrom=" + validFrom +
                        ", validTo=" + validTo +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                StationMngmt that = (StationMngmt) o;
                return principleFlag == that.principleFlag &&
                        displayFlag == that.displayFlag &&
                        stationStatusFlag == that.stationStatusFlag &&
                        outStnFlag == that.outStnFlag &&
                        Objects.equals(id, that.id) &&
                        Objects.equals(stationCode, that.stationCode) &&
                        Objects.equals(stationName, that.stationName) &&
                        Objects.equals(stationFullName, that.stationFullName) &&
                        Objects.equals(hindiNameAsciiName, that.hindiNameAsciiName) &&
                        Objects.equals(stnNameUtf, that.stnNameUtf) &&
                        Objects.equals(mstZoneMasterId, that.mstZoneMasterId) &&
                        Objects.equals(zoneCode, that.zoneCode) &&
                        Objects.equals(gauge, that.gauge) &&
                        Objects.equals(hillStnFlag, that.hillStnFlag) &&
                        Objects.equals(mstDivisionMasterId, that.mstDivisionMasterId) &&
                        Objects.equals(mstStateMasterId, that.mstStateMasterId) &&
                        Objects.equals(mstDistrictMasterId, that.mstDistrictMasterId) &&
                        Objects.equals(tehshil, that.tehshil) &&
                        Objects.equals(pincode, that.pincode) &&
                        Objects.equals(latLongCord, that.latLongCord) &&
                        Objects.equals(country, that.country) &&
                        Objects.equals(validFrom, that.validFrom) &&
                        Objects.equals(validTo, that.validTo);
            }

            
        }

    }

}
