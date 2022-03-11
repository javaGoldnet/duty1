package generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sys_pay_system_bak
 */
@TableName(value ="sys_pay_system_bak")
@Data
public class SysPaySystemBak implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "pay_name")
    private String pay_name;

    /**
     * 
     */
    @TableField(value = "pay_send_url")
    private String pay_send_url;

    /**
     * 
     */
    @TableField(value = "pay_send_method")
    private String pay_send_method;

    /**
     * 
     */
    @TableField(value = "notice_received_url")
    private String notice_received_url;

    /**
     * 
     */
    @TableField(value = "asynch_notice_received_url")
    private String asynch_notice_received_url;

    /**
     * 
     */
    @TableField(value = "pay_type")
    private Object pay_type;

    /**
     * 
     */
    @TableField(value = "is_test")
    private Object is_test;

    /**
     * 
     */
    @TableField(value = "test_pay_send_url")
    private String test_pay_send_url;

    /**
     * 
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 
     */
    @TableField(value = "pay_path")
    private String pay_path;

    /**
     * 
     */
    @TableField(value = "banktype")
    private Object banktype;

    /**
     * 
     */
    @TableField(value = "is_outreach")
    private String is_outreach;

    /**
     * 
     */
    @TableField(value = "is_support_decimal")
    private Object is_support_decimal;

    /**
     * 
     */
    @TableField(value = "mer_console_alias")
    private String mer_console_alias;

    /**
     * 
     */
    @TableField(value = "mer_no_alias")
    private String mer_no_alias;

    /**
     * 
     */
    @TableField(value = "mer_key_alias")
    private String mer_key_alias;

    /**
     * 
     */
    @TableField(value = "mer_console_prompt")
    private String mer_console_prompt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysPaySystemBak other = (SysPaySystemBak) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPay_name() == null ? other.getPay_name() == null : this.getPay_name().equals(other.getPay_name()))
            && (this.getPay_send_url() == null ? other.getPay_send_url() == null : this.getPay_send_url().equals(other.getPay_send_url()))
            && (this.getPay_send_method() == null ? other.getPay_send_method() == null : this.getPay_send_method().equals(other.getPay_send_method()))
            && (this.getNotice_received_url() == null ? other.getNotice_received_url() == null : this.getNotice_received_url().equals(other.getNotice_received_url()))
            && (this.getAsynch_notice_received_url() == null ? other.getAsynch_notice_received_url() == null : this.getAsynch_notice_received_url().equals(other.getAsynch_notice_received_url()))
            && (this.getPay_type() == null ? other.getPay_type() == null : this.getPay_type().equals(other.getPay_type()))
            && (this.getIs_test() == null ? other.getIs_test() == null : this.getIs_test().equals(other.getIs_test()))
            && (this.getTest_pay_send_url() == null ? other.getTest_pay_send_url() == null : this.getTest_pay_send_url().equals(other.getTest_pay_send_url()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPay_path() == null ? other.getPay_path() == null : this.getPay_path().equals(other.getPay_path()))
            && (this.getBanktype() == null ? other.getBanktype() == null : this.getBanktype().equals(other.getBanktype()))
            && (this.getIs_outreach() == null ? other.getIs_outreach() == null : this.getIs_outreach().equals(other.getIs_outreach()))
            && (this.getIs_support_decimal() == null ? other.getIs_support_decimal() == null : this.getIs_support_decimal().equals(other.getIs_support_decimal()))
            && (this.getMer_console_alias() == null ? other.getMer_console_alias() == null : this.getMer_console_alias().equals(other.getMer_console_alias()))
            && (this.getMer_no_alias() == null ? other.getMer_no_alias() == null : this.getMer_no_alias().equals(other.getMer_no_alias()))
            && (this.getMer_key_alias() == null ? other.getMer_key_alias() == null : this.getMer_key_alias().equals(other.getMer_key_alias()))
            && (this.getMer_console_prompt() == null ? other.getMer_console_prompt() == null : this.getMer_console_prompt().equals(other.getMer_console_prompt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPay_name() == null) ? 0 : getPay_name().hashCode());
        result = prime * result + ((getPay_send_url() == null) ? 0 : getPay_send_url().hashCode());
        result = prime * result + ((getPay_send_method() == null) ? 0 : getPay_send_method().hashCode());
        result = prime * result + ((getNotice_received_url() == null) ? 0 : getNotice_received_url().hashCode());
        result = prime * result + ((getAsynch_notice_received_url() == null) ? 0 : getAsynch_notice_received_url().hashCode());
        result = prime * result + ((getPay_type() == null) ? 0 : getPay_type().hashCode());
        result = prime * result + ((getIs_test() == null) ? 0 : getIs_test().hashCode());
        result = prime * result + ((getTest_pay_send_url() == null) ? 0 : getTest_pay_send_url().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPay_path() == null) ? 0 : getPay_path().hashCode());
        result = prime * result + ((getBanktype() == null) ? 0 : getBanktype().hashCode());
        result = prime * result + ((getIs_outreach() == null) ? 0 : getIs_outreach().hashCode());
        result = prime * result + ((getIs_support_decimal() == null) ? 0 : getIs_support_decimal().hashCode());
        result = prime * result + ((getMer_console_alias() == null) ? 0 : getMer_console_alias().hashCode());
        result = prime * result + ((getMer_no_alias() == null) ? 0 : getMer_no_alias().hashCode());
        result = prime * result + ((getMer_key_alias() == null) ? 0 : getMer_key_alias().hashCode());
        result = prime * result + ((getMer_console_prompt() == null) ? 0 : getMer_console_prompt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pay_name=").append(pay_name);
        sb.append(", pay_send_url=").append(pay_send_url);
        sb.append(", pay_send_method=").append(pay_send_method);
        sb.append(", notice_received_url=").append(notice_received_url);
        sb.append(", asynch_notice_received_url=").append(asynch_notice_received_url);
        sb.append(", pay_type=").append(pay_type);
        sb.append(", is_test=").append(is_test);
        sb.append(", test_pay_send_url=").append(test_pay_send_url);
        sb.append(", status=").append(status);
        sb.append(", pay_path=").append(pay_path);
        sb.append(", banktype=").append(banktype);
        sb.append(", is_outreach=").append(is_outreach);
        sb.append(", is_support_decimal=").append(is_support_decimal);
        sb.append(", mer_console_alias=").append(mer_console_alias);
        sb.append(", mer_no_alias=").append(mer_no_alias);
        sb.append(", mer_key_alias=").append(mer_key_alias);
        sb.append(", mer_console_prompt=").append(mer_console_prompt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}