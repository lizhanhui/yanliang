package tv.yanliang.domain;

import java.util.Date;

public abstract class AuditEntity extends IdentifiableEntity {

    private Date createDate;

    private Date updateDate;

    private long createUserId;

    private long modifyUserId;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(long createUserId) {
        this.createUserId = createUserId;
    }

    public long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }
}
