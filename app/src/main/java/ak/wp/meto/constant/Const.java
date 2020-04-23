package ak.wp.meto.constant;

public class Const {

    public static final String url = "http://www.marineeto.we.bs/wp-json/wp/v2/posts/";

    public static final String get_categories_url = "http://www.marineeto.we.bs/wp-json/wp/v2/categories?fields=id,description,name";

    public static final String get_all_posts_of_category_url = "http://www.marineeto.we.bs/wp-json/wp/v2/posts?categories=CATEGORY_ID&fields=id,date,link,title,better_featured_image";

    public static final String get_content_by_id = "http://www.marineeto.we.bs/wp-json/wp/v2/posts/POST_ID?fields=content";

    public static final String pages = "http://www.marineeto.we.bs/wp-json/wp/v2/pages/PAGE_ID?fields=content";

}
