package com.alibaba.benchmark.bean;

import java.util.HashMap;
import java.util.Map;

public class ComplexDO {

    private int pint;
    private long plong;
    private float pfloat;
    private String[] pstringArray;
    private String ip;


    public int getPint() {
        return pint;
    }

    public void setPint(int pint) {
        this.pint = pint;
    }

    public long getPlong() {
        return plong;
    }

    public void setPlong(long plong) {
        this.plong = plong;
    }

    public float getPfloat() {
        return pfloat;
    }

    public void setPfloat(float pfloat) {
        this.pfloat = pfloat;
    }

    public String[] getPstringArray() {
        return pstringArray;
    }

    public void setPstringArray(String[] pstringArray) {
        this.pstringArray = pstringArray;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public static ComplexDO getComplexDO() {
        ComplexDO vdo = new ComplexDO();
        String string1 = "A man was going to the house of some rich person. As he went along the road, he saw a box of good apples at the side of the road. He said, I do not want to eat those apples; for the rich man will give me much food; he will give me very nice food to eat. Then he took the apples and threw them away into the dust.";
        String string2 = "An old woman had a cat. The cat was very old; she could not run quickly, and she could not bite, because she was so old. One day the old cat saw a mouse; she jumped and caught the mouse. But she could not bite it; so the mouse got out of her mouth and ran away, because the cat could not bite it";
        String string3 = "Then the old woman became very angry because the cat had not killed the mouse. She began to hit the cat. The cat said, Do not hit your old servant. I have worked for you for many years, and I would work for you still, but I am too old. Do not be unkind to the old, but remember what good work the old did when they were young.";
        vdo.setPint(69);
        vdo.setPlong(56);
        vdo.setPfloat(10);
        vdo.setPstringArray(new String[]{string1, string2, string3});
        vdo.setIp("666.666.666.666");
        return vdo;
    }
}
