import mysql.connector
from faker import Faker
import random

# Database connection details
db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="mysqlpass",
    database="unibook",
    port=33306
)

cursor = db.cursor()
faker = Faker()

# Insert data into the users table
for _ in range(100):
    username = faker.user_name()
    email = faker.email()
    password = faker.password()
    cursor.execute("""
        INSERT INTO users (username, email, password)
        VALUES (%s, %s, %s)
    """, (username, email, password))

# Insert data into the textbooks table
conditions = ['New', 'Used', 'Like New', 'Good', 'Acceptable']
for _ in range(100):
    title = faker.catch_phrase()
    author = faker.name()
    price = round(random.uniform(10.0, 200.0), 2)
    book_condition = random.choice(conditions)
    cursor.execute("""
        INSERT INTO textbooks (title, author, price, book_condition)
        VALUES (%s, %s, %s, %s)
    """, (title, author, price, book_condition))

# Insert data into the courses table
departments = ['Computer Science', 'Math', 'Physics', 'Literature', 'Business']
for _ in range(50):
    course_name = faker.word()
    department = random.choice(departments)
    cursor.execute("""
        INSERT INTO courses (course_name, department)
        VALUES (%s, %s)
    """, (course_name, department))

# Insert data into the transactions table
cursor.execute("SELECT user_id FROM users")
users = cursor.fetchall()

cursor.execute("SELECT book_id FROM textbooks")
books = cursor.fetchall()

for _ in range(100):
    buyer_id = random.choice(users)[0]
    seller_id = random.choice(users)[0]
    while seller_id == buyer_id:  # Ensure buyer and seller are different
        seller_id = random.choice(users)[0]
    book_id = random.choice(books)[0]
    transaction_date = faker.date_this_year()
    cursor.execute("""
        INSERT INTO transactions (buyer_id, seller_id, book_id, transaction_date)
        VALUES (%s, %s, %s, %s)
    """, (buyer_id, seller_id, book_id, transaction_date))

# Commit changes to the database
db.commit()

# Close the cursor and connection
cursor.close()
db.close()
