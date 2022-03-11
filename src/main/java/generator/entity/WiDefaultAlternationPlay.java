package generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 轮播管理正在使用表
 * @TableName wi_default_alternation_play
 */
@TableName(value ="wi_default_alternation_play")
@Data
public class WiDefaultAlternationPlay implements Serializable {
    /**
     * 表Id
     */
    @TableId(value = "play_id")
    private Object play_id;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改者
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 原排序
     */
    @TableField(value = "old_sort")
    private Object old_sort;

    /**
     * 现排序
     */
    @TableField(value = "now_sort")
    private Object now_sort;

    /**
     * 标题繁体
     */
    @TableField(value = "title_tra")
    private String title_tra;

    /**
     * 标题简体
     */
    @TableField(value = "title_sim")
    private String title_sim;

    /**
     * 标题英文
     */
    @TableField(value = "title_eng")
    private String title_eng;

    /**
     * 图片繁体
     */
    @TableField(value = "pic_tra")
    private String pic_tra;

    /**
     * 图片简体
     */
    @TableField(value = "pic_sim")
    private String pic_sim;

    /**
     * 图片英文 
     */
    @TableField(value = "pic_eng")
    private String pic_eng;

    /**
     * 延迟时间繁体
     */
    @TableField(value = "delay_time_tra")
    private Object delay_time_tra;

    /**
     * 延迟时间简体
     */
    @TableField(value = "delay_time_sim")
    private Object delay_time_sim;

    /**
     * 延迟时间 英文
     */
    @TableField(value = "delay_time_eng")
    private Object delay_time_eng;

    /**
     * 连结繁体
     */
    @TableField(value = "junction_tra")
    private String junction_tra;

    /**
     * 连结简体
     */
    @TableField(value = "junction_sim")
    private String junction_sim;

    /**
     * 连结英文
     */
    @TableField(value = "junction_eng")
    private String junction_eng;

    /**
     * 关联案件表id
     */
    @TableField(value = "doc_id")
    private Object doc_id;

    /**
     * 审核状态：1-审核中2-已审核3-已撤销
     */
    @TableField(value = "auditing_status")
    private Object auditing_status;

    /**
     * 生效时间
     */
    @TableField(value = "effect_time")
    private LocalDateTime effect_time;

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
        WiDefaultAlternationPlay other = (WiDefaultAlternationPlay) that;
        return (this.getPlay_id() == null ? other.getPlay_id() == null : this.getPlay_id().equals(other.getPlay_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getOld_sort() == null ? other.getOld_sort() == null : this.getOld_sort().equals(other.getOld_sort()))
            && (this.getNow_sort() == null ? other.getNow_sort() == null : this.getNow_sort().equals(other.getNow_sort()))
            && (this.getTitle_tra() == null ? other.getTitle_tra() == null : this.getTitle_tra().equals(other.getTitle_tra()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getPic_tra() == null ? other.getPic_tra() == null : this.getPic_tra().equals(other.getPic_tra()))
            && (this.getPic_sim() == null ? other.getPic_sim() == null : this.getPic_sim().equals(other.getPic_sim()))
            && (this.getPic_eng() == null ? other.getPic_eng() == null : this.getPic_eng().equals(other.getPic_eng()))
            && (this.getDelay_time_tra() == null ? other.getDelay_time_tra() == null : this.getDelay_time_tra().equals(other.getDelay_time_tra()))
            && (this.getDelay_time_sim() == null ? other.getDelay_time_sim() == null : this.getDelay_time_sim().equals(other.getDelay_time_sim()))
            && (this.getDelay_time_eng() == null ? other.getDelay_time_eng() == null : this.getDelay_time_eng().equals(other.getDelay_time_eng()))
            && (this.getJunction_tra() == null ? other.getJunction_tra() == null : this.getJunction_tra().equals(other.getJunction_tra()))
            && (this.getJunction_sim() == null ? other.getJunction_sim() == null : this.getJunction_sim().equals(other.getJunction_sim()))
            && (this.getJunction_eng() == null ? other.getJunction_eng() == null : this.getJunction_eng().equals(other.getJunction_eng()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getAuditing_status() == null ? other.getAuditing_status() == null : this.getAuditing_status().equals(other.getAuditing_status()))
            && (this.getEffect_time() == null ? other.getEffect_time() == null : this.getEffect_time().equals(other.getEffect_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlay_id() == null) ? 0 : getPlay_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getOld_sort() == null) ? 0 : getOld_sort().hashCode());
        result = prime * result + ((getNow_sort() == null) ? 0 : getNow_sort().hashCode());
        result = prime * result + ((getTitle_tra() == null) ? 0 : getTitle_tra().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getPic_tra() == null) ? 0 : getPic_tra().hashCode());
        result = prime * result + ((getPic_sim() == null) ? 0 : getPic_sim().hashCode());
        result = prime * result + ((getPic_eng() == null) ? 0 : getPic_eng().hashCode());
        result = prime * result + ((getDelay_time_tra() == null) ? 0 : getDelay_time_tra().hashCode());
        result = prime * result + ((getDelay_time_sim() == null) ? 0 : getDelay_time_sim().hashCode());
        result = prime * result + ((getDelay_time_eng() == null) ? 0 : getDelay_time_eng().hashCode());
        result = prime * result + ((getJunction_tra() == null) ? 0 : getJunction_tra().hashCode());
        result = prime * result + ((getJunction_sim() == null) ? 0 : getJunction_sim().hashCode());
        result = prime * result + ((getJunction_eng() == null) ? 0 : getJunction_eng().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getAuditing_status() == null) ? 0 : getAuditing_status().hashCode());
        result = prime * result + ((getEffect_time() == null) ? 0 : getEffect_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", play_id=").append(play_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", old_sort=").append(old_sort);
        sb.append(", now_sort=").append(now_sort);
        sb.append(", title_tra=").append(title_tra);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", pic_tra=").append(pic_tra);
        sb.append(", pic_sim=").append(pic_sim);
        sb.append(", pic_eng=").append(pic_eng);
        sb.append(", delay_time_tra=").append(delay_time_tra);
        sb.append(", delay_time_sim=").append(delay_time_sim);
        sb.append(", delay_time_eng=").append(delay_time_eng);
        sb.append(", junction_tra=").append(junction_tra);
        sb.append(", junction_sim=").append(junction_sim);
        sb.append(", junction_eng=").append(junction_eng);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", auditing_status=").append(auditing_status);
        sb.append(", effect_time=").append(effect_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}