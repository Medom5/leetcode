typedef struct ListNode node;

node *add_helper(node *l1, node *l2, int carry)
{
    if (!l1 && !l2 && !carry)
        return NULL;

    int s = 0;
    if (l1 && l2)
        s = l1->val + l2->val;
    else if (l1)
        s = l1->val;
    else if (l2)
        s = l2->val;

    s += carry;

    node *n = (node *)malloc(sizeof(node));
    n->val = s % 10;
    n->next = add_helper(l1 ? l1->next : NULL, l2 ? l2->next : NULL, s >= 10 ? 1 : 0);

    return n;
}

struct ListNode *addTwoNumbers(struct ListNode *l1, struct ListNode *l2)
{
    return add_helper(l1, l2, 0);
}