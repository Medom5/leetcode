# Write your MySQL query statement below
Select s.user_id, COALESCE(ROUND(AVG(action = 'confirmed'),2),0) as confirmation_rate
FROM Signups s
Left Join Confirmations c ON s.user_id = c.user_id
GROUP BY s.user_id;
