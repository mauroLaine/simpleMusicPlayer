package com.example.mauro.playmusicservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

/**
 * Created by mauro on 8/16/17.
 */

//Class to save the tree, it also containt an arraylist fo nodetrees and increment the level
public class NodeTree {
    private String name;
    private ArrayList<NodeTree> children;
    private int level;

    NodeTree(String name, int level) {
        this.name = name;
        this.level = level;
        this.children = new ArrayList<>();
    }

    public void setChildren(ArrayList<NodeTree> children) {
        this.children = children;
    }

    public void addChildren(NodeTree nodeTree) {
        this.children.add(nodeTree);
        nodeTree.setLevel(this.level + 1);
    }

    public ArrayList<NodeTree> getChildren() {
        return this.children;
    }

    // getters and setters level

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
//
//class Tree {
//    private NodeTree root;
//
//    private HashSet<NodeTree> set;
//    private Queue<NodeTree> queue;
//
//    Tree(NodeTree root){
//        this.root = root;
//    }
//
////    TODO 9 print method
//    void printFromRoot(){
//        // We need to use BFS to generate the tree traversal.
////        TODO 10 we use the BFS Breadth First Search to print the elements
//        set.add(root);
//        queue.enqueue(root);
//
//        while(!queue.isEmpty()) {
//            NodeTree current = queue.dequeue();
////            TODO 11 we review the childs
//            for (NodeTree node : current.getChildren()){
////                TODO 12 if that set not containt the child it will add it, if yes it will printed
//                if (!set.contains(node)) {
//                    set.add(node);
//                    queue.enqueue(node);
//                } else {
////                    TODO 13 only to make the space and then print the correct name
//                    for(int i = 0; i < node.getLevel(); i++){
//                        // Increased indentation depending on the depth of the node in the tree
//                        System.out.print("\t");
//                    }
//                    System.out.println(node.getName());
//                }
//            }
//        }
//    }
//}
//
//class Solution {
//    HashMap<String, NodeTree> nodes = new HashMap<>();
//
//    public static void main(String[] args){
//        // input is going to be "B2,E5,F6"... and so on...
////        TODO 1 create the tree
//        NodeTree node = buildTree(args);
////        TODO 8 we recive the parent node to create the tree
////        and then we call the method print as a tree
//        Tree tree = new Tree(node);
//    }
//
//    public static NodeTree buildTree(String[] relationships) {
////        TODO 2 create the node
//        for(String relationship : relationships) {
//            buildNode(relationship);
//        }
//        // TODO 8 we sort the tree alphabetically
//        return findRootNode(nodes);
//    }
//
//    public static NodeTree findRootNode(HashMap<String, NodeTree> hashMap) {
//        // TODO 7 we sort the tree alphabetically
//        ArrayList<NodeTree> nodesAlphabetical = nodes.getKeys();
//        Collections.sort(nodesAlphabetical);
//
//        return nodesAlphabetical.get(0);
//
//    }
//
//    public static void buildNode(String relationship) {
////        TODO 3 split the string to get the names
//        String nodeNames[] = relationship.split(",");
//        if(nodeNames.length > 0) {
////            TODO 4 Check if exist the node if not create the current node
//            NodeTree currentNode = nodes.get(nodeNames[0]); //
//            if (currentNode == null) {
//                currentNode = new NodeTree(nodeNames[0]);
//                nodes.put(nodeNames[0], currentNode);
//            }
////            TODO 5 add childs to the current node
//            for (int i = 1; i < nodeNames.length; i++) {
//                NodeTree childrenNode = nodes.get(nodeNames[i]);
//                if (childrenNode == null) {
//                    childrenNode = new NodeTree(nodeNames[i]);
//                    nodes.put(nodeNames[i], childrenNode);
//                }
//                currentNode.addChildren(childrenNode);
//            }
//        }
//    }
//}
