package com.example.allshoppy.activitys;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.example.allshoppy.adapters.CategoryAdapter;
import com.example.allshoppy.adapters.ProductAdapter;
import com.example.allshoppy.databinding.ActivityMainBinding;
import com.example.allshoppy.model.Category;
import com.example.allshoppy.model.Product;
import com.mancj.materialsearchbar.MaterialSearchBar;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.searchBar.setOnSearchActionListener(new MaterialSearchBar.OnSearchActionListener() {
            @Override
            public void onSearchStateChanged(boolean enabled) {

            }

            @Override
            public void onSearchConfirmed(CharSequence text) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("query", text.toString());
                startActivity(intent);
            }

            @Override
            public void onButtonClicked(int buttonCode) {

            }
        });

        initCategories();
        initProducts();
        initSlider();
    }

    private void initSlider() {
        getRecentOffers();
    }

    void initCategories() {
        categories = new ArrayList<>();
        categoryAdapter = new CategoryAdapter(this, categories);

        getCategories();

        GridLayoutManager layoutManager = new GridLayoutManager(this, 5);
        binding.categoriesList.setLayoutManager(layoutManager);
        binding.categoriesList.setAdapter(categoryAdapter);
    }

    void getCategories() {
        Category a = new Category("shopping", "https://w7.pngwing.com/pngs/15/271/png-transparent-computer-icons-online-shopping-shopping-cart-service-shopping-cart-icon-text-service-retail-thumbnail.png", "#D9E1EB", "hello world", 0);

        Category a1 = new Category("social", "https://cdn.shopify.com/app-store/listing_images/0dce682fb3602fe48c948f046351cae8/icon/CKf1kIGJ2IEDEAE=.png", "#A6E1FA", "hello world", 1);
        Category a2 = new Category("clothing", "https://cdn-icons-png.flaticon.com/512/3531/3531818.png", "#F7DAD9", "hello world", 2);
        Category a3 = new Category("mobiles", "https://cdn-icons-png.flaticon.com/512/5521/5521112.png", "#FFDDC1", "hello world", 3);
        Category a4 = new Category("grocery", "https://cdn-icons-png.flaticon.com/512/3724/3724763.png", "#D9EAD3", "hello world", 4);
        Category a5 = new Category("furniture", "https://cdn-icons-png.flaticon.com/512/3939/3939382.png", "#D9C2E9", "hello world", 5);
        Category a6 = new Category("travel", "https://cdn-icons-png.flaticon.com/512/6350/6350271.png", "#C8E9D6", "hello world", 6);
        Category a7 = new Category("movies", "https://cdn-icons-png.flaticon.com/512/2503/2503508.png", "#FFEBCC", "hello world", 7);
        Category a8 = new Category("coupons", "https://as1.ftcdn.net/v2/jpg/05/21/75/04/1000_F_521750469_IoGQHk4XS30DObmPqm9raprzUVPPB2jg.jpg", "#E0D9FA", "hello world", 8);
        Category a9 = new Category("paybills", "https://cdni.iconscout.com/illustration/premium/thumb/woman-pay-bills-via-card-payment-5854405-5071533.png", "#FFD9E9", "hello world", 9);

        categories.add(a);
        categories.add(a1);
        categories.add(a2);
        categories.add(a3);
        categories.add(a4);
        categories.add(a5);
        categories.add(a6);
        categories.add(a7);
        categories.add(a8);
        categories.add(a9);
    }

    void getRecentProducts() {

        Product p = new Product("Top Stories", "https://thumbs.dreamstime.com/b/text-sign-showing-top-stories-conceptual-photo-most-read-important-news-information-messages-headlines-129595874.jpg", "2", 0.0, 0, 1, 11);

        Product p1 = new Product("Deal of the Day", "https://static.vecteezy.com/system/resources/thumbnails/016/186/303/small_2x/daily-deals-of-the-day-with-decorative-lettering-text-style-for-poster-or-label-in-flat-cartoon-hand-drawn-background-templates-illustration-vector.jpg", "2", 0.0, 0, 1, 1);
        Product p2 = new Product("Clothing and Fashion", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwWvpHcJx74aPzpkWR5GuBidZsNMTXF17bIA&s", "2", 0.0, 0, 1, 12);
        Product p3 = new Product("Electronics", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvwvUJRTWhOsx0tJ9_glXhu7NG-eYzbn9vpg&s", "2", 0.0, 0, 1, 13);
        Product p4 = new Product("Recharge and Bill Pay", "https://payrupya.com/images/recharge.png", "2", 0.0, 0, 1, 1);
        Product p5 = new Product("Entertainment", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxDin8yqPNHRJEswe8ogoUoF0XF9L-D5LzaA&s", "2", 0.0, 0, 1, 14);
        Product p6 = new Product("Travel", "https://play-lh.googleusercontent.com/Zw2EmfHE_pUKtdMhHOOIn__DdsgKsd82guAvC5ei6WLjdMpqToe2LxE7_4TBvHe_s6c", "2", 0.0, 0, 1, 15);
        Product p7 = new Product("Food and Grocery", "https://www.shutterstock.com/shutterstock/photos/2315995169/display_1500/stock-vector-food-grocery-store-shopping-vector-illustration-with-foods-items-and-products-assortiment-on-the-2315995169.jpg", "2", 0.0, 0, 1, 16);
        Product p8 = new Product("Medicine", "https://m.economictimes.com/thumb/height-450,width-600,imgsize-34152,msid-94270374/overuse-of-medicine.jpg", "2", 0.0, 0, 1, 17);
        Product p9 = new Product("Baby and Kids", "https://media.koelnmesse.io/kindundjugend/redaktionell/kind-jugend/img/magazin/trendbericht-branche/trendbericht_modu_dreamer_set_1200x675_m24_full_m36_1025.jpg", "2", 0.0, 0, 1, 18);
        Product p10 = new Product("Social", "https://www.searchenginejournal.com/wp-content/uploads/2021/09/16-reasons-why-social-media-is-important-to-your-company-616d3200e6dc6-sej.png", "2", 0.0, 0, 1, 19);
        Product p11 = new Product("Home Decor", "https://m.media-amazon.com/images/I/71XQ-Fc1lXL.jpg", "2", 0.0, 0, 1, 20);
        Product p12 = new Product("Coupon and Compare", "https://marketplace.canva.com/EAFZbgv0Yj0/2/0/1131w/canva-red-yellow-minimalist-shopping-coupon-qg5_fokTeCQ.jpg", "2", 0.0, 0, 1, 21);
        Product p13 = new Product("Printing", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDQdwg44mWkN45YGXNCQ7R2LeKP9GJ5QHy3g&s", "2", 0.0, 0, 1, 22);
        Product p14 = new Product("Gifts", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0WrR-AA_nl2lqHiVSRmJE3B2sD6jOgQJVAQ&s", "2", 0.0, 0, 1, 23);
        Product p15 = new Product("Books", "https://static.scientificamerican.com/sciam/cache/file/1DDFE633-2B85-468D-B28D05ADAE7D1AD8_source.jpg?w=1200", "2", 0.0, 0, 1, 24);
        Product p16 = new Product("Automobile", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7vTulz4YoM0TscMwGGFhAu2QZ8GINsWjBgg&s", "2", 0.0, 0, 1, 25);
        Product p17 = new Product("Real Estate", "https://assets.everspringpartners.com/fe/06/f23661be455e97d009c6ae418995/real-estate-finance.jpg", "2", 0.0, 0, 1, 26);
        Product p18 = new Product("Finance", "https://www.berlinsbi.com/uploads/sites/2/2021/12/7-very-good-reasons-to-do-master-s-in-finance.jpg", "2", 0.0, 0, 1, 27);
        Product p19 = new Product("Sports", "https://etimg.etb2bimg.com/photo/74881928.cms", "2", 0.0, 0, 1, 28);
        Product p20 = new Product("Jobs", "https://static.toiimg.com/thumb/msid-106098609,width-1280,height-720,resizemode-4/106098609.jpg", "2", 0.0, 0, 1, 29);
        Product p21 = new Product("Technology", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNPhOiA73nPZCbPDI_o1W36nSthWi7Cqs06w&s", "2", 0.0, 0, 1, 30);
        Product p22 = new Product("News", "https://static.vecteezy.com/system/resources/thumbnails/004/216/831/original/3d-world-news-background-loop-free-video.jpg", "2", 0.0, 0, 1, 31);
        Product p23 = new Product("Other Services", "https://cdn-icons-png.flaticon.com/512/2907/2907308.png", "2", 0.0, 0, 1, 32);

        products.add(p);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        products.add(p9);
        products.add(p10);
        products.add(p11);
        products.add(p12);
        products.add(p13);
        products.add(p14);
        products.add(p15);
        products.add(p16);
        products.add(p17);
        products.add(p18);
        products.add(p19);
        products.add(p20);
        products.add(p21);
        products.add(p22);
        products.add(p23);


        productAdapter.notifyDataSetChanged();

    }

    void getRecentOffers() {
        binding.carousel.addData(
                new CarouselItem(
                        "https://thumbs.dreamstime.com/b/top-stories-rubber-stamp-grunge-design-dust-scratches-effects-can-be-easily-removed-clean-crisp-look-color-easily-84505016.jpg",
                        "Top Stories"
                )
        );
        binding.carousel.addData(
                new CarouselItem(
                        "https://media.geeksforgeeks.org/wp-content/uploads/20231020102559/Discount.png",
                        "Discount Offers"
                )
        );
        binding.carousel.addData(
                new CarouselItem(
                        "https://img.freepik.com/free-psd/fashion-event-facebook-template_23-2150283919.jpg",
                        "Fashion"
                )
        );
        binding.carousel.addData(
                new CarouselItem(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEXoeTiQRZOyjQdni3zmUjvIsRnxEXUp-1jQ&s",
                        "Laptop Sales"
                )
        );
    }

    void initProducts() {
        products = new ArrayList<>();
        productAdapter = new ProductAdapter(this, products);

        getRecentProducts();

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        binding.productList.setLayoutManager(layoutManager);
        binding.productList.setAdapter(productAdapter);
    }

}