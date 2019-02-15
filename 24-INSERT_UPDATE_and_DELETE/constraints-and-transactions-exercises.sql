-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor;
INSERT INTO actor (first_name, last_name)
VALUES ('HAMPTON', 'AVENUE'), ('LISA', 'BYWAY');
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
SELECT * FROM film;

INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

SELECT * FROM film
WHERE title = 'Euclidean PI';

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (actor_id, film_id)
VALUES (203, 1001), (204, 1001);

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name)
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT * FROM film
WHERE title IN ('EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');
UPDATE film_category
SET category_id = 17
WHERE film_id IN (SELECT film_id FROM film
WHERE title IN ('EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE', 'Euclidean PI'));
SELECT * FROM film
WHERE title = 'Euclidean PI';
SELECT * FROM film_categry
WHERE film_id = 1001;
INSERT INTO film_category (film_id, category_id)
VALUES (1001, 17);
SELECT * FROM film_category
WHERE film_id = 1001;
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating = 'G'
WHERE film_id IN (SELECT film_id FROM film_category
WHERE category_id = 17);
SELECT * FROM film
WHERE title IN ('EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE', 'Euclidean PI'); 

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1), (1001, 2)
;
SELECT * FROM inventory
WHERE film_id = 1001
;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> No because foreign key constraint would be violated (FILM_ID IS A FOREIGN KEY IN FILM_ACTOR)
--DELETE FROM film
--WHERE film_id = 1001
--;
-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> No because foreign key constraint would be violated (CATEGORY_ID IS A FOREIGN KEY IN FILM_CATEGORY)
--DELETE FROM category
--WHERE name = 'Mathmagical'
--;

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> YES because film_id and category_id in film_category are not primary or foriegn keys
DELETE FROM film_category
WHERE category_id = 17
;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE> DELETED  Mathmagical worked because I removed the foreign key in film_category. Deleting the film did not work becuase it still exists in the inventory
DELETE FROM category
WHERE name = 'Mathmagical'
;
SELECT * FROM category;

--DELETE FROM film
--WHERE film_id = 1001
--;
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
-- We wuld have to delete the film_id 1001 from the inventory table and then delete the film_id 1001 from film table

