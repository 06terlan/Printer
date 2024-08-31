package tarlan.printer.com.helper;

import java.util.Map;
import java.util.HashMap;

/**
 * PrefixTreeNode represents a node in a prefix tree (Trie), where each node stores a character
 * and a map of child nodes that represent subsequent characters in the prefix.
 */
public class PrefixTreeNode {

    /**
     * The character associated with this node in the prefix tree.
     */
    public Character prefix;

    /**
     * A map of child nodes, where each key is a character and the corresponding value
     * is the next node in the prefix tree.
     */
    public Map<Character, PrefixTreeNode> children;

    /**
     * Constructs a PrefixTreeNode with the specified character and an empty map of child nodes.
     *
     * @param prefix the character to be stored in this node.
     */
    public PrefixTreeNode(Character prefix) {
        this.prefix = prefix;
        this.children = new HashMap<>();
    }
}
