# Write your MySQL query statement below
Select s.user_id, ROUND(AVG(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END),2) as confirmation_rate
FROM Signups s
Left Join Confirmations c ON s.user_id = c.user_id
GROUP BY s.user_id;
