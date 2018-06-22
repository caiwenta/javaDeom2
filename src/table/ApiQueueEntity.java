package table;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "api_queue", schema = "dbo", catalog = "wdd_erp_snsn")
public class ApiQueueEntity {
    private int tdocId;
    private String tdocMethod;
    private String tdocXml;
    private String tdocRemark;
    private Integer tdocState;
    private Timestamp tdocAddtime;
    private Integer tdocUpdates;
    private Timestamp tdocUpdatime;
    private Long tdocHash;
    private String wddtaskcode;
    private Integer tdocErpId;
    private String tdocApitoken;
    private Integer tdocCpId;
    private Integer tdocLevel;
    private Timestamp tdocDequeuedate;
    private String tdocTarget;
    private String tdocAction;
    private Integer tdocShid;
    private String tdocNo;
    private int tdocPriority;
    private int tdocElapsed;
    private int tdocTotal;
    private Timestamp tdocBeatdate;

    @Id
    @Column(name = "tdoc_id")
    public int getTdocId() {
        return tdocId;
    }

    public void setTdocId(int tdocId) {
        this.tdocId = tdocId;
    }

    @Basic
    @Column(name = "tdoc_method")
    public String getTdocMethod() {
        return tdocMethod;
    }

    public void setTdocMethod(String tdocMethod) {
        this.tdocMethod = tdocMethod;
    }

    @Basic
    @Column(name = "tdoc_xml")
    public String getTdocXml() {
        return tdocXml;
    }

    public void setTdocXml(String tdocXml) {
        this.tdocXml = tdocXml;
    }

    @Basic
    @Column(name = "tdoc_remark")
    public String getTdocRemark() {
        return tdocRemark;
    }

    public void setTdocRemark(String tdocRemark) {
        this.tdocRemark = tdocRemark;
    }

    @Basic
    @Column(name = "tdoc_state")
    public Integer getTdocState() {
        return tdocState;
    }

    public void setTdocState(Integer tdocState) {
        this.tdocState = tdocState;
    }

    @Basic
    @Column(name = "tdoc_addtime")
    public Timestamp getTdocAddtime() {
        return tdocAddtime;
    }

    public void setTdocAddtime(Timestamp tdocAddtime) {
        this.tdocAddtime = tdocAddtime;
    }

    @Basic
    @Column(name = "tdoc_updates")
    public Integer getTdocUpdates() {
        return tdocUpdates;
    }

    public void setTdocUpdates(Integer tdocUpdates) {
        this.tdocUpdates = tdocUpdates;
    }

    @Basic
    @Column(name = "tdoc_updatime")
    public Timestamp getTdocUpdatime() {
        return tdocUpdatime;
    }

    public void setTdocUpdatime(Timestamp tdocUpdatime) {
        this.tdocUpdatime = tdocUpdatime;
    }

    @Basic
    @Column(name = "tdoc_hash")
    public Long getTdocHash() {
        return tdocHash;
    }

    public void setTdocHash(Long tdocHash) {
        this.tdocHash = tdocHash;
    }

    @Basic
    @Column(name = "wddtaskcode")
    public String getWddtaskcode() {
        return wddtaskcode;
    }

    public void setWddtaskcode(String wddtaskcode) {
        this.wddtaskcode = wddtaskcode;
    }

    @Basic
    @Column(name = "tdoc_erp_id")
    public Integer getTdocErpId() {
        return tdocErpId;
    }

    public void setTdocErpId(Integer tdocErpId) {
        this.tdocErpId = tdocErpId;
    }

    @Basic
    @Column(name = "tdoc_apitoken")
    public String getTdocApitoken() {
        return tdocApitoken;
    }

    public void setTdocApitoken(String tdocApitoken) {
        this.tdocApitoken = tdocApitoken;
    }

    @Basic
    @Column(name = "tdoc_cp_id")
    public Integer getTdocCpId() {
        return tdocCpId;
    }

    public void setTdocCpId(Integer tdocCpId) {
        this.tdocCpId = tdocCpId;
    }

    @Basic
    @Column(name = "tdoc_level")
    public Integer getTdocLevel() {
        return tdocLevel;
    }

    public void setTdocLevel(Integer tdocLevel) {
        this.tdocLevel = tdocLevel;
    }

    @Basic
    @Column(name = "tdoc_dequeuedate")
    public Timestamp getTdocDequeuedate() {
        return tdocDequeuedate;
    }

    public void setTdocDequeuedate(Timestamp tdocDequeuedate) {
        this.tdocDequeuedate = tdocDequeuedate;
    }

    @Basic
    @Column(name = "tdoc_target")
    public String getTdocTarget() {
        return tdocTarget;
    }

    public void setTdocTarget(String tdocTarget) {
        this.tdocTarget = tdocTarget;
    }

    @Basic
    @Column(name = "tdoc_action")
    public String getTdocAction() {
        return tdocAction;
    }

    public void setTdocAction(String tdocAction) {
        this.tdocAction = tdocAction;
    }

    @Basic
    @Column(name = "tdoc_shid")
    public Integer getTdocShid() {
        return tdocShid;
    }

    public void setTdocShid(Integer tdocShid) {
        this.tdocShid = tdocShid;
    }

    @Basic
    @Column(name = "tdoc_no")
    public String getTdocNo() {
        return tdocNo;
    }

    public void setTdocNo(String tdocNo) {
        this.tdocNo = tdocNo;
    }

    @Basic
    @Column(name = "tdoc_priority")
    public int getTdocPriority() {
        return tdocPriority;
    }

    public void setTdocPriority(int tdocPriority) {
        this.tdocPriority = tdocPriority;
    }

    @Basic
    @Column(name = "tdoc_elapsed")
    public int getTdocElapsed() {
        return tdocElapsed;
    }

    public void setTdocElapsed(int tdocElapsed) {
        this.tdocElapsed = tdocElapsed;
    }

    @Basic
    @Column(name = "tdoc_total")
    public int getTdocTotal() {
        return tdocTotal;
    }

    public void setTdocTotal(int tdocTotal) {
        this.tdocTotal = tdocTotal;
    }

    @Basic
    @Column(name = "tdoc_beatdate")
    public Timestamp getTdocBeatdate() {
        return tdocBeatdate;
    }

    public void setTdocBeatdate(Timestamp tdocBeatdate) {
        this.tdocBeatdate = tdocBeatdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiQueueEntity that = (ApiQueueEntity) o;
        return tdocId == that.tdocId &&
                tdocPriority == that.tdocPriority &&
                tdocElapsed == that.tdocElapsed &&
                tdocTotal == that.tdocTotal &&
                Objects.equals(tdocMethod, that.tdocMethod) &&
                Objects.equals(tdocXml, that.tdocXml) &&
                Objects.equals(tdocRemark, that.tdocRemark) &&
                Objects.equals(tdocState, that.tdocState) &&
                Objects.equals(tdocAddtime, that.tdocAddtime) &&
                Objects.equals(tdocUpdates, that.tdocUpdates) &&
                Objects.equals(tdocUpdatime, that.tdocUpdatime) &&
                Objects.equals(tdocHash, that.tdocHash) &&
                Objects.equals(wddtaskcode, that.wddtaskcode) &&
                Objects.equals(tdocErpId, that.tdocErpId) &&
                Objects.equals(tdocApitoken, that.tdocApitoken) &&
                Objects.equals(tdocCpId, that.tdocCpId) &&
                Objects.equals(tdocLevel, that.tdocLevel) &&
                Objects.equals(tdocDequeuedate, that.tdocDequeuedate) &&
                Objects.equals(tdocTarget, that.tdocTarget) &&
                Objects.equals(tdocAction, that.tdocAction) &&
                Objects.equals(tdocShid, that.tdocShid) &&
                Objects.equals(tdocNo, that.tdocNo) &&
                Objects.equals(tdocBeatdate, that.tdocBeatdate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tdocId, tdocMethod, tdocXml, tdocRemark, tdocState, tdocAddtime, tdocUpdates, tdocUpdatime, tdocHash, wddtaskcode, tdocErpId, tdocApitoken, tdocCpId, tdocLevel, tdocDequeuedate, tdocTarget, tdocAction, tdocShid, tdocNo, tdocPriority, tdocElapsed, tdocTotal, tdocBeatdate);
    }
}
