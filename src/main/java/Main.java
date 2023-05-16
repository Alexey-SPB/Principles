public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 01;
        post.birthday.month = 01;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.passport = "1111 №12345678";
        post.patronymic = "Иванович";
        post.phone = "+7(999)123-45-67";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
