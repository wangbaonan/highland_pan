package pog.highlandpan.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @TableName contigs
 */
@TableName(value ="contigs")
@Data
@EqualsAndHashCode(callSuper=false)
public class Contigs implements Serializable {
    /**
     * 
     */
    @TableId
    private String contigId;

    /**
     * 
     */
    private String population;

    /**
     * 
     */
    private String category;

    /**
     * 
     */
    private String chr;

    /**
     * 
     */
    private String start;

    /**
     * 
     */
    private Long calcStart;

    /**
     * 
     */
    private String end;

    /**
     * 
     */
    private Long calcEnd;

    /**
     * 
     */
    private String contig;

    /**
     * 
     */
    private String sample;

    /**
     * 
     */
    private String strand;

    /**
     * 
     */
    private Long length;

    /**
     * 
     */
    private String gene;

    /**
     * 
     */
    private String annotation;

    /**
     * 
     */
    private String eoriNumber;

    /**
     * 
     */
    private String cds;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}