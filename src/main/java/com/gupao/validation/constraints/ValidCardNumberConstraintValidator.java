package com.gupao.validation.constraints;



//import org.springframework.util.StringUtils;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class ValidCardNumberConstraintValidator implements ConstraintValidator<ValidCardNumber,String> {

    public void initialize( ValidCardNumber validCardNumber ){

    }

    /**
     *
     * @param
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid( String value, ConstraintValidatorContext constraintValidatorContext ) {

        //前半部分和后半部分(切割字符串)
        String[] parts = org.springframework.util.StringUtils.delimitedListToStringArray(value,"-");
        //为什么不用 split 方法，该方法使用正则表达式，其次是 NPE 保护不够
        if( parts.length != 2 ){
            return false;
        }

        String prefix = parts[0];
        String suffix = parts[1];

        boolean isValidPrefix = Objects.equals(  prefix,"GUPAO" );

        boolean isValidInteger = StringUtils.isNumeric(  suffix );

        return isValidPrefix & isValidInteger;

    }


}
