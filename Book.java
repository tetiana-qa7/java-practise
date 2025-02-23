public class Book extends Product{
        private String author;

        public Book(String name, double price, ProductType type, String author){
            setName(name);
            setPrice(price);
            setType(type);
            setAuthor(author);
        }

        public void setAuthor(String author){
            this.author = author;
        }

        public String getAuthor(){
            return author;
        }

        @Override
        public String getDescription(){
            return "name of the book :" + getName() + ", price of the book: " + getPrice() + ", product type: " + getType() +  ", author: " + getAuthor();
        }

        @Override
        public String toString() {
            return super.toString() + ", author='" + author + "' }";
        }

    }

