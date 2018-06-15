package com.example.zengwei.zwtank.Model;

import org.litepal.crud.DataSupport;

/**
 * Created by zengwei on 2018/6/15.
 * 碎片
 */

public class Piece extends DataSupport {
    private String pieceid;   //碎片id
    private int piecesum;  //碎片数量

    public String getPieceid() {
        return pieceid;
    }

    public void setPieceid(String pieceid) {
        this.pieceid = pieceid;
    }

    public int getPiecesum() {
        return piecesum;
    }

    public void setPiecesum(int piecesum) {
        this.piecesum = piecesum;
    }
}
