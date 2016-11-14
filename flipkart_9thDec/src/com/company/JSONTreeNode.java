package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

/**
 * Created by shilpagu on 12/9/2014.
 */

public class JSONTreeNode {
    public static void setName(char name) {
        JSONTreeNode.name = name;
    }

    public static void addjSon(JSONTreeNode jSon) {

        JSONTreeNode.jSon.add(jSon);
    }

    public static char name;
    public static ArrayList<Integer> I=null;
    public static ArrayList<JSONTreeNode> jSon=null;

    public static void setI(ArrayList<Integer> i) {
        I = i;
    }

    public static void addI(int i) {
        I.add(i);
    }

    public static void setjSon(ArrayList<JSONTreeNode> jSon) {
        JSONTreeNode.jSon = jSon;
    }

    public JSONTreeNode(){
        I=new ArrayList<Integer>();
        jSon = new ArrayList<JSONTreeNode>();
    }
    public JSONTreeNode(JSONTreeNode node){
        if(node != null){
        setName(node.getName());
        setjSon(node.getjSon());
        setI(node.getI());
        }


    }

    public static char getName() {
        return name;
    }

    public static ArrayList<Integer> getI() {
        return I;
    }

    public static ArrayList<JSONTreeNode> getjSon() {
        return jSon;
    }
}
