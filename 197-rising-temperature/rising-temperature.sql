# Write your MySQL query statement below
select w.id from Weather w
join Weather ww
on datediff(w.recordDate , ww.recordDate) = 1
where w.temperature > ww.temperature;