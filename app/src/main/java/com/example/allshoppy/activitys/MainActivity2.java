package com.example.allshoppy.activitys;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.allshoppy.adapters.BigIconAdapter;
import com.example.allshoppy.adapters.ProductAdapter;
import com.example.allshoppy.databinding.ActivityMain2Binding;
import com.example.allshoppy.model.BigIcon;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;
    private ArrayList<BigIcon> listItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int id = getIntent().getIntExtra("id", -1);
        getItemsForCategory(id);

        BigIconAdapter adapter = new BigIconAdapter(this, listItems);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        binding.recyclerView.setAdapter(adapter);
    }

    private void getItemsForCategory(int id) {
if(id==0){
    loadAmazonItems();
}
        if (id == 1) {
            social();
        } else if (id == 2) {
         clothing();
        } else if (id == 3) {
          mobile();
        } else if (id == 4) {
          grocery();
        } else if (id == 5) {
          furiture();
        } else if (id == 6) {
          travel();
        } else if (id == 7) {
              movies();
        } else if (id == 8) {
              coupons();
        } else if (id == 9) {
                 paybills();
        }
        if (id == 11) {
             topStories();
        } else if (id == 12) {
               deal_of_theDay();
        } else if (id == 13) {
              clothingandFashion();
        } else if (id == 14) {
         electronics();
        } else if (id == 15) {
          rechargeandbillpay();
        } else if (id == 16) {
              entertenmaint();
        } else if (id == 17) {
                travel();
        } else if (id == 18) {
           grocery();
        } else if (id == 19) {
         medicine();
        }
        else if(id==20){
          babyandkids();
        }  if (id == 21) {
              social();
        } else if (id == 22) {
            furiture();
        } else if (id == 23) {
             coupons();
        } else if (id == 24) {
               printing();
        } else if (id == 25) {
               gifts();
        } else if (id == 26) {
                 books();
        } else if (id == 27) {
                    automobile();
        } else if (id == 28) {
           realestate();
        } else if (id == 29) {
              finance();
        } else if (id == 30) {
            mobile();
        } else if (id == 31) {
               news();
        } else if (id == 32) {
               otherservices();      
        }

    }

    private void rechargeandbillpay() {
        listItems.add(new BigIcon("Paytm Mall", "https://paytmmall.com/tmassets/paytmMallNew.png", "https://paytmmall.com"));
        listItems.add(new BigIcon("Amazon", "https://static.vecteezy.com/system/resources/previews/014/018/561/non_2x/amazon-logo-on-transparent-background-free-vector.jpg", "https://www.amazon.com"));
        listItems.add(new BigIcon("Flipkart", "https://i.pinimg.com/736x/aa/70/8d/aa708d1f97a04f6f5a208213f89e1e67.jpg", "https://www.flipkart.com"));
        listItems.add(new BigIcon("SnapDeal", "https://qph.cf2.quoracdn.net/main-qimg-461d80645211909e459a00c0ba52e6af-pjlq", "https://www.snapdeal.com"));
        listItems.add(new BigIcon("ShopClues", "https://5.imimg.com/data5/SELLER/Default/2023/6/318056141/SR/BJ/UJ/123005145/shopclues-logo-big-500x500.png", "https://www.shopclues.com"));
        listItems.add(new BigIcon("BigBasket", "https://www.thestatesman.com/wp-content/uploads/2021/02/basket-twitter.jpg", "https://www.bigbasket.com"));
        listItems.add(new BigIcon("BlinkIt", "https://cdn.siasat.com/wp-content/uploads/2023/02/Blinkit.jpg", "https://www.blinkit.com"));
        listItems.add(new BigIcon("Zomato", "https://i.pinimg.com/736x/f4/34/e3/f434e30f1c5a170fc4700661cc99c3ab.jpg", "https://www.zomato.com"));
        listItems.add(new BigIcon("MakeMyTrip", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMIhXzHuFEMsfuBIPBxKxx6q73S7Tws6Lq7g&s", "https://www.makemytrip.com"));
        listItems.add(new BigIcon("Goibibo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnlPdE8h8DIeoa4DNTty-lWcPUdTFJtjb1Rw&s", "https://www.goibibo.com"));
        listItems.add(new BigIcon("OYO", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPDOnW8NltdRMx4LX3vn2P9hLxcQ9S1pXuhw&s", "https://www.oyorooms.com"));
        listItems.add(new BigIcon("RedBus", "https://logowik.com/content/uploads/images/t_redbus2333.logowik.com.webp", "https://www.redbus.in"));
        listItems.add(new BigIcon("Ola", "https://cdn.iconscout.com/icon/free/png-256/free-ola-282225.png?f=webp", "https://www.olacabs.com"));
        listItems.add(new BigIcon("BookMYShow", "https://edgerewards.axisbank.co.in/r360-catalogue-bucket/app/catalogImages/Bookmyshow_21022023.jpg", "https://in.bookmyshow.com"));
        listItems.add(new BigIcon("RailYatri", "https://m.media-amazon.com/images/I/51cfA-GdihL.png", "https://www.railyatri.in"));
        listItems.add(new BigIcon("JioMart", "https://img.etimg.com/thumb/width-1200,height-1200,imgsize-42276,resizemode-75,msid-83304075/industry/services/retail/jiomart-faces-uphill-task-to-compete-with-amazon-flipkart-on-smartphone-sales.jpg", "https://www.jiomart.com"));
    }

    private void electronics() {
        mobile();
    }

    private void clothingandFashion() {
        clothing();
    }

    private void entertenmaint() {
        mobile();
    }

    private void medicine() {
        grocery();
    }

    private void deal_of_theDay() {
        topStories();
    }

    private void babyandkids() {
        listItems.add(new BigIcon("FirstCry", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyzRJjQakmIMT9lQiMljVwLqRRJCx8br56mg&s", "https://www.firstcry.com"));
    }

    private void printing() {
        mobile();
    }

    private void gifts() {
        coupons();
    }

    private void books() {
        entertenmaint();
    }

    private void automobile() {
        travel();
    }

    private void realestate() {
        furiture();
    }

    private void finance() {
        paybills();
    }

    private void news() {
        entertenmaint();
    }

    private void otherservices() {
        listItems.add(new BigIcon("Adidas", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Adidas_Logo.svg/2560px-Adidas_Logo.svg.png", "https://www.adidas.com"));
        listItems.add(new BigIcon("Jockey", "https://i.pinimg.com/originals/9e/ad/eb/9eadebb86d93bc3454376e93bec03fa7.jpg", "https://www.jockey.com"));
        listItems.add(new BigIcon("FirstCry", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyzRJjQakmIMT9lQiMljVwLqRRJCx8br56mg&s", "https://www.firstcry.com"));
        listItems.add(new BigIcon("Hopscotch", "https://dcassetcdn.com/design_img/3439752/47349/47349_18866978_3439752_aac43dba_image.png", "https://www.hopscotch.in"));
        listItems.add(new BigIcon("Purple", "https://seeklogo.com/images/P/purplle-logo-69794948B5-seeklogo.com.png", "https://www.purplle.com"));
        listItems.add(new BigIcon("BigBasket", "https://www.thestatesman.com/wp-content/uploads/2021/02/basket-twitter.jpg", "https://www.bigbasket.com"));
        listItems.add(new BigIcon("BlinkIt", "https://cdn.siasat.com/wp-content/uploads/2023/02/Blinkit.jpg", "https://www.blinkit.com"));
        listItems.add(new BigIcon("MySmartPrice", "https://static.startuptalky.com/2021/04/-mysmartprice-logo-startuptalky.jpg", "https://www.mysmartprice.com"));
        listItems.add(new BigIcon("ShopClues", "https://5.imimg.com/data5/SELLER/Default/2023/6/318056141/SR/BJ/UJ/123005145/shopclues-logo-big-500x500.png", "https://www.shopclues.com"));
        listItems.add(new BigIcon("SnapDeal", "https://qph.cf2.quoracdn.net/main-qimg-461d80645211909e459a00c0ba52e6af-pjlq", "https://www.snapdeal.com"));
        listItems.add(new BigIcon("Croma", "https://logowik.com/content/uploads/images/croma9414.logowik.com.webp", "https://www.croma.com"));
        listItems.add(new BigIcon("Zomato", "https://i.pinimg.com/736x/f4/34/e3/f434e30f1c5a170fc4700661cc99c3ab.jpg", "https://www.zomato.com"));
        listItems.add(new BigIcon("MakeMyTrip", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMIhXzHuFEMsfuBIPBxKxx6q73S7Tws6Lq7g&s", "https://www.makemytrip.com"));
        listItems.add(new BigIcon("Goibibo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnlPdE8h8DIeoa4DNTty-lWcPUdTFJtjb1Rw&s", "https://www.goibibo.com"));
        listItems.add(new BigIcon("OYO", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPDOnW8NltdRMx4LX3vn2P9hLxcQ9S1pXuhw&s", "https://www.oyorooms.com"));
        listItems.add(new BigIcon("RedBus", "https://logowik.com/content/uploads/images/t_redbus2333.logowik.com.webp", "https://www.redbus.in"));
        listItems.add(new BigIcon("Ola", "https://cdn.iconscout.com/icon/free/png-256/free-ola-282225.png?f=webp", "https://www.olacabs.com"));
        listItems.add(new BigIcon("BookMYShow", "https://edgerewards.axisbank.co.in/r360-catalogue-bucket/app/catalogImages/Bookmyshow_21022023.jpg", "https://in.bookmyshow.com"));
        listItems.add(new BigIcon("PayU", "https://w7.pngwing.com/pngs/488/784/png-transparent-money-payment-payu-circle-payment-icon.png", "https://www.payu.in"));
    }

    private void topStories() {
        loadAmazonItems();
    }

    private void paybills() {
        listItems.add(new BigIcon("Paytm", "https://assetscdn1.paytm.com/images/catalog/view/305388/1707892437147.png", "https://paytm.com"));
        listItems.add(new BigIcon("PhonePe", "https://i.pinimg.com/originals/db/42/53/db4253052cfc0f80ac281486c19f9d57.png", "https://www.phonepe.com"));
        listItems.add(new BigIcon("Google Pay", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLg07l7aaudJxcCyYN0CosAe44W7JARmjisg&s", "https://pay.google.com"));
        listItems.add(new BigIcon("Freecharge", "https://pbs.twimg.com/profile_images/1641783471113752577/WnxwbHb0_400x400.png", "https://www.freecharge.in"));
        listItems.add(new BigIcon("Airtel Payments Bank", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKE6-6fvFO2nR8FMMyi7IBdaOsYpIsWy1i1A&s", "https://www.airtel.in/bank"));
        listItems.add(new BigIcon("MobiKwik", "https://images.firstpost.com/wp-content/uploads/2017/10/mobikwik-380.png?im=FitAndFill=(1200,675)", "https://www.mobikwik.com"));
        listItems.add(new BigIcon("Amazon Pay", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJqbCvUxDsIeOYa51HsMGhIcF_5Dj8EEatlg&s", "https://pay.amazon.in"));
        listItems.add(new BigIcon("BHIM", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0MuXXvowCeVggXbyeWUoPk6lYBenZYRHh0A&s", "https://www.bhimupi.org.in"));
        listItems.add(new BigIcon("SBI Anywhere", "https://static.toiimg.com/photo/msid-68149955/68149955.jpg", "https://www.onlinesbi.com"));
        listItems.add(new BigIcon("HDFC Bank", "https://1000logos.net/wp-content/uploads/2021/06/HDFC-Bank-emblem.png", "https://www.hdfcbank.com"));
    }

    private void coupons() {
        listItems.add(new BigIcon("CouponDunia", "https://www.coupondunia.in/app/assets/images/coupondunia-logo-og.png", "https://www.coupondunia.in"));
        listItems.add(new BigIcon("GrabOn", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGnSZGFUNXVtgPp5Xk3rYItVVWGv1FQJ0jbQ&s", "https://www.grabon.in"));
        listItems.add(new BigIcon("CashKaro", "https://static-asset.inc42.com/cashkaro.png", "https://cashkaro.com"));
        listItems.add(new BigIcon("CouponRaja", "https://images.crunchbase.com/image/upload/c_pad,h_256,w_256,f_auto,q_auto:eco,dpr_1/v1414987988/ln0hfczhsungt2lmf5jo.png", "https://www.couponraja.in"));
        listItems.add(new BigIcon("Freecharge", "https://upload.wikimedia.org/wikipedia/commons/9/90/FreeCharge_Logo.png", "https://www.freecharge.in"));
        listItems.add(new BigIcon("MagicPin", "https://play-lh.googleusercontent.com/ypvB94bjfOLH8QC4TZGpZ328Gz_4zwrlPPim4N4bOr3oLHDP-9TqskBQRN2pwwd7nWk", "https://www.magicpin.in"));
        listItems.add(new BigIcon("CouponZeta", "https://pbs.twimg.com/profile_images/854999878119940096/gWvgQbBU_400x400.jpg", "https://www.couponzeta.in"));
        listItems.add(new BigIcon("VoucherCodes", "https://seeklogo.com/images/V/voucher-codes-logo-C11CF5B3E7-seeklogo.com.gif", "https://www.vouchercodes.co.uk"));
        listItems.add(new BigIcon("CouponRani", "https://images.yourstory.com/cs/wordpress/2013/02/CouponRani-Logo-Transparent-2.jpg?fm=png&auto=format&blur=500", "https://www.couponrani.com"));
        listItems.add(new BigIcon("CouponZGuru", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRaaIrqbwv_xpN9mawM5L8xfeHT1A0fsV-9A&s", "https://www.couponzguru.com"));

    }

    private void movies() {
        listItems.add(new BigIcon("BookMyShow", "https://edgerewards.axisbank.co.in/r360-catalogue-bucket/app/catalogImages/Bookmyshow_21022023.jpg", "https://in.bookmyshow.com"));
        listItems.add(new BigIcon("Paytm Movies", "https://www.medianews4u.com/wp-content/uploads/2017/04/paytm-movies-logo-2-2.jpg", "https://paytm.com/movies"));
        listItems.add(new BigIcon("TicketNew", "https://exchange4media.gumlet.io/news-photo/1508928975_uCGMwe_big_(2).jpg?w=400&dpr=2.6", "https://www.ticketnew.com"));
        listItems.add(new BigIcon("PVR Cinemas", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSc-RWAJIrsO8maSr7fbavtYR9JXOV_Q9i1Hw&s", "https://www.pvrcinemas.com"));
        listItems.add(new BigIcon("INOX Movies", "https://s3.ap-southeast-1.amazonaws.com/cdn.inoxmovies.com/AboutUsNew/inox-header-logo.png", "https://www.inoxmovies.com"));
        listItems.add(new BigIcon("Cinepolis India", "https://images.jdmagicbox.com/comp/gurgaon/e6/011pxx11.xx11.090429132903.c8e6/catalogue/cinepolis-india-pvt-ltd-corporate-office-gurgaon-sector-44-gurgaon-corporate-office-services-28zjs11-250.jpg", "https://www.cinepolisindia.com"));
        listItems.add(new BigIcon("SPI Cinemas", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTN5NXoZDqQGIAg_F0VCHR9Xp6EbGjRNApy2w&s", "https://www.spicinemas.in"));
        listItems.add(new BigIcon("Carnival Cinemas", "https://www.adgully.com/img/400x300/202108/carnival.png.jpg", "https://www.carnivalcinemas.com"));
    }

    private void travel() {
        listItems.add(new BigIcon("Booking.com", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhKbIcst4RbcohJgTr2ZNa15Zqn0LWTUGk5Q&s", "https://www.booking.com/"));
        listItems.add(new BigIcon("Expedia", "https://i.pinimg.com/736x/03/ff/2f/03ff2f150e164f9c76ecdaae0c332872.jpg", "https://www.expedia.com/"));
        listItems.add(new BigIcon("TripAdvisor", "https://logos-world.net/wp-content/uploads/2020/11/Tripadvisor-Logo.png", "https://www.tripadvisor.com/"));
        listItems.add(new BigIcon("Hotels.com", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTl1m1kx8cDs9eNGg5DyzvVGJr7t5Ao2q51_A&s", "https://www.hotels.com/"));
        listItems.add(new BigIcon("Airbnb", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzq_r2hwsfNjAKNln-l_uSE_VM35iLTxjctQ&s", "https://www.airbnb.com/"));
        listItems.add(new BigIcon("Agoda", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJagcgoNLb8Gn6rINQYRfIrpMvwt3M9a6Q2w&s", "https://www.agoda.com/"));
        listItems.add(new BigIcon("MakeMyTrip", "https://d1yjjnpx0p53s8.cloudfront.net/styles/logo-thumbnail/s3/112019/mmt_fullcolor.png?JgFR3clMwpXRH2xztnw10uhf0tUSghgS&itok=2eLs41rV", "https://www.makemytrip.com/"));
        listItems.add(new BigIcon("Cleartrip", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUf8BwpNDuC3GY4sroK8lLn7O-mCMIyU3QNQ&s", "https://www.cleartrip.com/"));
        listItems.add(new BigIcon("Hostelworld", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTokF4bU-b9zkC9j7jHz9g7uqq0YkzkPZrbJw&s", "https://www.hostelworld.com/"));
        listItems.add(new BigIcon("Booking.com (Flights)", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBPqRwPPCaC09_AusnAPJANhjARfr8Aclurw&s", "https://www.booking.com/flights"));
    }

    private void furiture() {
        listItems.add(new BigIcon("Amazon", "https://static.vecteezy.com/system/resources/previews/014/018/561/non_2x/amazon-logo-on-transparent-background-free-vector.jpg", "https://www.amazon.com"));
        listItems.add(new BigIcon("Flipkart", "https://i.pinimg.com/736x/aa/70/8d/aa708d1f97a04f6f5a208213f89e1e67.jpg", "https://www.flipkart.com"));
        listItems.add(new BigIcon("Pepperfry", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQljKPJNqAlDUkIPdJXxcRj3OamhnDQ6SzqQQ&s", "https://www.pepperfry.com"));
        listItems.add(new BigIcon("Urban Ladder", "https://www.urbanladder.com/deadpul-public/assets/images/branding/animated-logo.b3951.gif", "https://www.urbanladder.com"));
        listItems.add(new BigIcon("HomeTown", "https://dcassetcdn.com/design_img/1998252/450519/450519_10661661_1998252_1e8c2009_image.jpg", "https://www.hometown.in"));
        listItems.add(new BigIcon("IKEA", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOZrINb_2l4fAuj-Y7XWQmHXHZb5dmC0QmIg&s", "https://www.ikea.com"));
        listItems.add(new BigIcon("Paytm Mall", "https://paytmmall.com/tmassets/paytmMallNew.png", "https://paytmmall.com"));
        listItems.add(new BigIcon("Home Decor", "https://img.freepik.com/premium-vector/home-decor-logo-design_626969-132.jpg", "https://www.example.com"));
        listItems.add(new BigIcon("UrbanClap", "https://static.thenounproject.com/png/630862-200.png", "https://www.example.com"));

    }

    private void grocery() {
        listItems.add(new BigIcon("Domino's", "https://w7.pngwing.com/pngs/264/277/png-transparent-domino-s-pizza-enterprises-logo-resturant-angle-rectangle-logo.png", "https://www.dominos.com"));
        listItems.add(new BigIcon("Foodpanda", "https://upload.wikimedia.org/wikipedia/commons/c/cb/Foodpanda_logo_since_2017.jpeg", "https://www.foodpanda.com"));
        listItems.add(new BigIcon("McDonald's", "https://e7.pngegg.com/pngimages/676/74/png-clipart-fast-food-mcdonald-s-logo-golden-arches-restaurant-mcdonalds-mcdonald-s-logo-miscellaneous-food-thumbnail.png", "https://www.mcdonalds.com"));
        listItems.add(new BigIcon("Swiggy", "https://1000logos.net/wp-content/uploads/2021/05/Swiggy-logo.png", "https://www.swiggy.com"));
        listItems.add(new BigIcon("Pizza Hut", "https://logowik.com/content/uploads/images/294_pizza_hut_new_logo.jpg", "https://www.pizzahut.com"));
        listItems.add(new BigIcon("KFC", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1IvitoAZ2HtmEjx7fLcJ1ny9cIfAPSatgBA&s", "https://www.kfc.com"));
        listItems.add(new BigIcon("BigBasket", "https://seeklogo.com/images/B/bigbasket-logo-CCFD652568-seeklogo.com.png", "https://www.bigbasket.com"));
        listItems.add(new BigIcon("Patanjali", "https://i.pinimg.com/originals/b8/8f/95/b88f950aad7506371929f973899426dc.png", "https://www.patanjaliayurved.net"));
        listItems.add(new BigIcon("Zomato", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUWeoFdisV4C7lv6dEFKP-zjWbRvs2BB4f9A&s", "https://www.zomato.com"));
        listItems.add(new BigIcon("Blinkit", "https://images.crunchbase.com/image/upload/c_pad,f_auto,q_auto:eco,dpr_1/ozrgpc6hulbfxyi1zeqd", "https://www.blinkit.com"));
        listItems.add(new BigIcon("RailYatri", "https://m.media-amazon.com/images/I/51cfA-GdihL.png", "https://www.railyatri.in"));
        listItems.add(new BigIcon("JioMart", "https://img.etimg.com/thumb/width-1200,height-1200,imgsize-42276,resizemode-75,msid-83304075/industry/services/retail/jiomart-faces-uphill-task-to-compete-with-amazon-flipkart-on-smartphone-sales.jpg", "https://www.jiomart.com"));
    }

    private void mobile() {
        listItems.add(new BigIcon("Amazon", "https://static.vecteezy.com/system/resources/previews/014/018/561/non_2x/amazon-logo-on-transparent-background-free-vector.jpg", "https://www.amazon.com"));
        listItems.add(new BigIcon("Flipkart", "https://i.pinimg.com/736x/aa/70/8d/aa708d1f97a04f6f5a208213f89e1e67.jpg", "https://www.flipkart.com"));
        listItems.add(new BigIcon("Paytm Mall", "https://paytmmall.com/tmassets/paytmMallNew.png", "https://paytmmall.com"));
        listItems.add(new BigIcon("Croma", "https://logowik.com/content/uploads/images/croma9414.logowik.com.webp", "https://www.croma.com"));
        listItems.add(new BigIcon("Tata Cliq", "https://logowik.com/content/uploads/images/tata-cliq1303.logowik.com.webp", "https://www.tatacliq.com"));
        listItems.add(new BigIcon("Mi", "https://logos-world.net/wp-content/uploads/2020/07/Xiaomi-Logo.png", "https://www.mi.com"));
        listItems.add(new BigIcon("Apple", "https://1000logos.net/wp-content/uploads/2016/10/Apple-Logo.png", "https://www.apple.com"));
        listItems.add(new BigIcon("OnePlus", "https://static1.xdaimages.com/wordpress/wp-content/uploads/2020/03/OnePlus-Logo_new_1.jpg", "https://www.oneplus.in"));

    }

    private void clothing() {
        listItems.add(new BigIcon("Myntra", "https://images.indianexpress.com/2021/01/myntra.png", "https://www.myntra.com"));
        listItems.add(new BigIcon("LensKart", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-RB5nuYaxUuaC9_0emA9ZjV32xEGkerpUAw&s", "https://www.lenskart.com"));
        listItems.add(new BigIcon("Nykaa", "https://cdn.iconscout.com/icon/free/png-256/free-nykaa-3384872-2822953.png?f=webp", "https://www.nykaa.com"));
        listItems.add(new BigIcon("max", "https://upload.wikimedia.org/wikipedia/commons/b/b0/Logo_of_Max_Fashion_and_Accessories%2C_March_2018.png", "https://www.maxfashion.in"));
        listItems.add(new BigIcon("Reebook", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Reebok_2019_logo.svg/1200px-Reebok_2019_logo.svg.png", "https://www.reebok.com"));
        listItems.add(new BigIcon("Adidas", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Adidas_Logo.svg/2560px-Adidas_Logo.svg.png", "https://www.adidas.com"));
        listItems.add(new BigIcon("Jockey", "https://i.pinimg.com/originals/9e/ad/eb/9eadebb86d93bc3454376e93bec03fa7.jpg", "https://www.jockey.com"));
        listItems.add(new BigIcon("Ajio", "https://www.dealnloot.com/wp-content/uploads/2019/07/ajio-logo.png", "https://www.ajio.com"));
        listItems.add(new BigIcon("Zivame", "https://lh3.googleusercontent.com/proxy/BA5Ak-kD4Koxmk9gzVf5sly4wqkNMa3AiUT7vQp25jsWKzQ7wSobKe-WZqyAbfkYceYKfbcid7s_rubL_0mjLTCL2_qAIw", "https://www.zivame.com"));
        listItems.add(new BigIcon("Pepe Jeans", "https://1000logos.net/wp-content/uploads/2021/05/Pepe-Jeans-logo.png", "https://www.pepejeans.com"));
        listItems.add(new BigIcon("Peter England", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREo70tyeGITxSFT3AV94oxAS4TaxoehzAulQ&s", "https://www.peterengland.com"));
        listItems.add(new BigIcon("Spyker", "https://upload.wikimedia.org/wikipedia/en/thumb/8/82/Spyker_Cars_logo.svg/800px-Spyker_Cars_logo.svg.png", "https://www.spykercars.com"));
        listItems.add(new BigIcon("Levis", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmaXUB283n6DB9aD2EMP6R2bpdC5ekZf5GuQ&s", "https://www.levi.com"));
        listItems.add(new BigIcon("NNNow", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTa6QXgPM7mikZSnV2pK0QYXfFtcLZKqsS9qg&s", "https://www.nnnow.com"));
        listItems.add(new BigIcon("Calvin Klein", "https://logowik.com/content/uploads/images/calvin-klein5506.jpg", "https://www.calvinklein.us"));
        listItems.add(new BigIcon("US Polo", "https://static.vecteezy.com/system/resources/previews/024/455/583/original/us-polo-assn-brand-symbol-logo-with-name-red-clothes-design-icon-abstract-illustration-free-vector.jpg", "https://www.uspoloassn.com"));
        listItems.add(new BigIcon("Tommy Hilfiger", "https://logowik.com/content/uploads/images/tommy-hilfiger3583.logowik.com.webp", "https://usa.tommy.com"));

    }


    private void loadAmazonItems() {
        listItems.add(new BigIcon("Amazon", "https://static.vecteezy.com/system/resources/previews/014/018/561/non_2x/amazon-logo-on-transparent-background-free-vector.jpg", "https://www.amazon.com"));
        listItems.add(new BigIcon("Flipkart", "https://i.pinimg.com/736x/aa/70/8d/aa708d1f97a04f6f5a208213f89e1e67.jpg", "https://www.flipkart.com"));
        listItems.add(new BigIcon("Myntra", "https://images.indianexpress.com/2021/01/myntra.png", "https://www.myntra.com"));
        listItems.add(new BigIcon("LensKart", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-RB5nuYaxUuaC9_0emA9ZjV32xEGkerpUAw&s", "https://www.lenskart.com"));
        listItems.add(new BigIcon("Nykaa", "https://cdn.iconscout.com/icon/free/png-256/free-nykaa-3384872-2822953.png?f=webp", "https://www.nykaa.com"));
        listItems.add(new BigIcon("CouponDunia", "https://www.coupondunia.in/app/assets/images/coupondunia-logo-og.png", "https://www.coupondunia.in"));
        listItems.add(new BigIcon("Ajio", "https://www.dealnloot.com/wp-content/uploads/2019/07/ajio-logo.png", "https://www.ajio.com"));
        listItems.add(new BigIcon("Paytm Mall", "https://paytmmall.com/tmassets/paytmMallNew.png", "https://paytmmall.com"));
        listItems.add(new BigIcon("zivame", "https://lh3.googleusercontent.com/proxy/BA5Ak-kD4Koxmk9gzVf5sly4wqkNMa3AiUT7vQp25jsWKzQ7wSobKe-WZqyAbfkYceYKfbcid7s_rubL_0mjLTCL2_qAIw", "https://www.zivame.com"));
        listItems.add(new BigIcon("max", "https://upload.wikimedia.org/wikipedia/commons/b/b0/Logo_of_Max_Fashion_and_Accessories%2C_March_2018.png", "https://www.maxfashion.in"));
        listItems.add(new BigIcon("Reebook", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Reebok_2019_logo.svg/1200px-Reebok_2019_logo.svg.png", "https://www.reebok.com"));
        listItems.add(new BigIcon("Adidas", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Adidas_Logo.svg/2560px-Adidas_Logo.svg.png", "https://www.adidas.com"));
        listItems.add(new BigIcon("Jockey", "https://i.pinimg.com/originals/9e/ad/eb/9eadebb86d93bc3454376e93bec03fa7.jpg", "https://www.jockey.com"));
        listItems.add(new BigIcon("FirstCry", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyzRJjQakmIMT9lQiMljVwLqRRJCx8br56mg&s", "https://www.firstcry.com"));
        listItems.add(new BigIcon("Hopscotch", "https://dcassetcdn.com/design_img/3439752/47349/47349_18866978_3439752_aac43dba_image.png", "https://www.hopscotch.in"));
        listItems.add(new BigIcon("Purple", "https://seeklogo.com/images/P/purplle-logo-69794948B5-seeklogo.com.png", "https://www.purplle.com"));
        listItems.add(new BigIcon("BigBasket", "https://www.thestatesman.com/wp-content/uploads/2021/02/basket-twitter.jpg", "https://www.bigbasket.com"));
        listItems.add(new BigIcon("BlinkIt", "https://cdn.siasat.com/wp-content/uploads/2023/02/Blinkit.jpg", "https://www.blinkit.com"));
        listItems.add(new BigIcon("MySmartPrice", "https://static.startuptalky.com/2021/04/-mysmartprice-logo-startuptalky.jpg", "https://www.mysmartprice.com"));
        listItems.add(new BigIcon("ShopClues", "https://5.imimg.com/data5/SELLER/Default/2023/6/318056141/SR/BJ/UJ/123005145/shopclues-logo-big-500x500.png", "https://www.shopclues.com"));
        listItems.add(new BigIcon("SnapDeal", "https://qph.cf2.quoracdn.net/main-qimg-461d80645211909e459a00c0ba52e6af-pjlq", "https://www.snapdeal.com"));
        listItems.add(new BigIcon("Croma", "https://logowik.com/content/uploads/images/croma9414.logowik.com.webp", "https://www.croma.com"));
        listItems.add(new BigIcon("Zomato", "https://i.pinimg.com/736x/f4/34/e3/f434e30f1c5a170fc4700661cc99c3ab.jpg", "https://www.zomato.com"));
        listItems.add(new BigIcon("MakeMyTrip", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMIhXzHuFEMsfuBIPBxKxx6q73S7Tws6Lq7g&s", "https://www.makemytrip.com"));
        listItems.add(new BigIcon("Goibibo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnlPdE8h8DIeoa4DNTty-lWcPUdTFJtjb1Rw&s", "https://www.goibibo.com"));
        listItems.add(new BigIcon("OYO", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPDOnW8NltdRMx4LX3vn2P9hLxcQ9S1pXuhw&s", "https://www.oyorooms.com"));
        listItems.add(new BigIcon("RedBus", "https://logowik.com/content/uploads/images/t_redbus2333.logowik.com.webp", "https://www.redbus.in"));
        listItems.add(new BigIcon("Ola", "https://cdn.iconscout.com/icon/free/png-256/free-ola-282225.png?f=webp", "https://www.olacabs.com"));
        listItems.add(new BigIcon("BookMYShow", "https://edgerewards.axisbank.co.in/r360-catalogue-bucket/app/catalogImages/Bookmyshow_21022023.jpg", "https://in.bookmyshow.com"));
        listItems.add(new BigIcon("PayU", "https://w7.pngwing.com/pngs/488/784/png-transparent-money-payment-payu-circle-payment-icon.png", "https://www.payu.in"));
        listItems.add(new BigIcon("Amante", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_2xX36IF248qkcybg5apPyCSiGKImcGZ0pQ&s", "https://www.amantelingerie.com"));
        listItems.add(new BigIcon("CalvinKlein", "https://logowik.com/content/uploads/images/calvin-klein5506.jpg", "https://www.calvinklein.us"));
        listItems.add(new BigIcon("NNNow", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTa6QXgPM7mikZSnV2pK0QYXfFtcLZKqsS9qg&s", "https://www.nnnow.com"));
        listItems.add(new BigIcon("Levis", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmaXUB283n6DB9aD2EMP6R2bpdC5ekZf5GuQ&s", "https://www.levi.com"));
        listItems.add(new BigIcon("PepeJeans", "https://1000logos.net/wp-content/uploads/2021/05/Pepe-Jeans-logo.png", "https://www.pepejeans.com"));
        listItems.add(new BigIcon("PeterEngland", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREo70tyeGITxSFT3AV94oxAS4TaxoehzAulQ&s", "https://www.peterengland.com"));
        listItems.add(new BigIcon("Spyker", "https://upload.wikimedia.org/wikipedia/en/thumb/8/82/Spyker_Cars_logo.svg/800px-Spyker_Cars_logo.svg.png", "https://www.spykercars.com"));
        listItems.add(new BigIcon("USpolo", "https://static.vecteezy.com/system/resources/previews/024/455/583/original/us-polo-assn-brand-symbol-logo-with-name-red-clothes-design-icon-abstract-illustration-free-vector.jpg", "https://www.uspoloassn.com"));
        listItems.add(new BigIcon("TommyHilfiger", "https://logowik.com/content/uploads/images/tommy-hilfiger3583.logowik.com.webp", "https://usa.tommy.com"));
        listItems.add(new BigIcon("Beardo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWcqvxfh6d1PSqWnBq0MBOxZjY6PpoNSKO7Q&s", "https://www.beardo.in"));
        listItems.add(new BigIcon("Nike", "https://logos-world.net/wp-content/uploads/2020/04/Nike-Logo.png", "https://www.nike.com"));
        listItems.add(new BigIcon("Puma", "https://qph.cf2.quoracdn.net/main-qimg-46e4cf54e93ad179ff19843dde22f4d6-lq", "https://www.puma.com"));
        listItems.add(new BigIcon("Red Chief", "https://zsquaremall.com/application/uploads/stores/1573995006_11073.jpg", "https://www.redchief.in"));
        listItems.add(new BigIcon("RedTape", "https://mir-s3-cdn-cf.behance.net/projects/404/45931667692161.Y3JvcCw0MDQsMzE2LDc5NSww.jpg", "https://www.redtape.com"));
        listItems.add(new BigIcon("Apple", "https://1000logos.net/wp-content/uploads/2016/10/Apple-Logo.png", "https://www.apple.com"));
        listItems.add(new BigIcon("Oziva", "https://media.licdn.com/dms/image/C510BAQEtmiybYan10g/company-logo_200_200/0/1630617970805/oziva_logo?e=2147483647&v=beta&t=meAgOJlpIe4C95-AVYN6H4CqAxLe5Gblg0GviejnzBg", "https://www.oziva.in"));
        listItems.add(new BigIcon("SmartPrix", "https://cdn1.smartprix.com/rx-iYKjLo4il/smartprix-og-image.png", "https://www.smartprix.com"));
        listItems.add(new BigIcon("BuyBooks", "https://media.licdn.com/dms/image/C4E0BAQFVLYgix23sIw/company-logo_200_200/0/1630642811837?e=2147483647&v=beta&t=7UCIsjSRiWX2wHgPxw5qL2mUi7KyS2f1YR0l0m2fZnA", "https://www.buybooks.com"));
        listItems.add(new BigIcon("Housing.com", "https://mir-s3-cdn-cf.behance.net/projects/404/0d1608163222961.Y3JvcCwxMDgwLDg0NCwwLDExNw.png", "https://housing.com"));
        listItems.add(new BigIcon("Dairy Milk", "https://1000logos.net/wp-content/uploads/2022/08/Cadbury-Dairy-Milk-Logo.png", "https://www.cadbury.co.uk"));
        listItems.add(new BigIcon("Cred", "https://upload.wikimedia.org/wikipedia/en/7/7c/CRED_%28FinTech_company%29_logo.png", "https://cred.club"));
        listItems.add(new BigIcon("Cadbury", "https://mir-s3-cdn-cf.behance.net/projects/404/c549e2196112957.Y3JvcCw8MDgsNjMyLDAsMA.png", "https://www.cadbury.co.uk"));
        listItems.add(new BigIcon("IPL", "https://www.jagranimages.com/images/newimg/21082020/21_08_2020-ipl_logo_20650553.jpg", "https://www.iplt20.com"));
        listItems.add(new BigIcon("Acko", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8O5UN3zBXw_lYEUjhmrWfBeUYqmP2Zns3nw&s", "https://www.acko.com"));
        listItems.add(new BigIcon("Unacademy", "https://qph.cf2.quoracdn.net/main-qimg-4735459140d0660c6fd3ccdd56f8883d-lq", "https://unacademy.com"));
        listItems.add(new BigIcon("Adda247", "https://cdn.branch.io/branch-assets/1579178940133-og_image.png", "https://www.adda247.com"));
        listItems.add(new BigIcon("Freelancer", "https://logowik.com/content/uploads/images/freelancer.jpg", "https://www.freelancer.com"));
        listItems.add(new BigIcon("Google News", "https://cdn.dribbble.com/userupload/4799317/file/still-c6ebb4830871183ad89d363c526619f3.gif?resize=400x0", "https://news.google.com"));
        listItems.add(new BigIcon("BigRock", "https://content.jdmagicbox.com/mumbai/q7/033pxx33.xx33.130611101529.b4q7/catalogue/bigrock-solutions-pvt-ltd-customer-care-internet-domain-name-registration-62qmb.jpg", "https://www.bigrock.in"));
        listItems.add(new BigIcon("GoDaddy", "https://cdn.vox-cdn.com/thumbor/_gBFEIlf6EqPuYwM2wL-khu8_LI=/0x0:1182x664/1400x788/filters:focal(591x332:592x333)/cdn.vox-cdn.com/uploads/chorus_asset/file/19600442/Screen_Shot_2020_01_14_at_11.10.20_AM.png", "https://www.godaddy.com"));
        listItems.add(new BigIcon("Microsoft", "https://static.vecteezy.com/system/resources/previews/027/127/493/non_2x/microsoft-logo-microsoft-icon-transparent-free-png.png", "https://www.microsoft.com"));



    }
    private void social(){
        listItems.add(new BigIcon("Facebook", "https://static.vecteezy.com/system/resources/previews/018/930/698/original/facebook-logo-facebook-icon-transparent-free-png.png", "https://www.facebook.com"));
        listItems.add(new BigIcon("Instagram", "https://img.freepik.com/free-vector/instagram-vector-social-media-icon-7-june-2021-bangkok-thailand_53876-136728.jpg?size=338&ext=jpg&ga=GA1.1.2082370165.1717182000&semt=ais_user", "https://www.instagram.com"));
        listItems.add(new BigIcon("Twitter", "https://cdn.mos.cms.futurecdn.net/z3bn6deaxmrjmQHNEkpcZE-1200-80.jpg", "https://www.twitter.com"));
        listItems.add(new BigIcon("TikTok", "https://cdn.vectorstock.com/i/1000v/75/87/tiktok-logo-on-black-background-vector-35997587.jpg", "https://www.tiktok.com"));
        listItems.add(new BigIcon("Snapchat", "https://www.usatoday.com/gcdn/presto/2019/08/16/USAT/bd6538e4-5535-41ce-857b-518451c3a958-Snapchat_Logo_H.png?crop=1125,1500,x674,y0", "https://www.snapchat.com"));
        listItems.add(new BigIcon("LinkedIn", "https://static.vecteezy.com/system/resources/previews/023/986/970/original/linkedin-logo-linkedin-logo-transparent-linkedin-icon-transparent-free-free-png.png", "https://www.linkedin.com"));
        listItems.add(new BigIcon("Pinterest", "https://static-00.iconduck.com/assets.00/pinterest-icon-2048x2048-d7p0u7c5.png", "https://www.pinterest.com"));
        listItems.add(new BigIcon("Reddit", "https://static-00.iconduck.com/assets.00/reddit-icon-2048x2048-ya82zt8l.png", "https://www.reddit.com"));
        listItems.add(new BigIcon("WhatsApp", "https://i.pinimg.com/736x/6c/78/49/6c784972cbf5806215d46fbda8b0c46a.jpg", "https://www.whatsapp.com"));
        listItems.add(new BigIcon("YouTube", "https://img.freepik.com/free-psd/3d-circle-with-youtube-logo-isolated-transparent-background_125540-3736.jpg", "https://www.youtube.com"));
        listItems.add(new BigIcon("WeChat", "https://static.vecteezy.com/system/resources/previews/018/930/576/non_2x/wechat-logo-wechat-icon-transparent-free-png.png", "https://www.wechat.com"));
        listItems.add(new BigIcon("Tumblr", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpFcepexKBR8qZxBbLxd-Rj3SxZrmMdXJMSA&s", "https://www.tumblr.com"));
        listItems.add(new BigIcon("Quora", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo_jwJKhRmD0ITRLbCbZq8GWWVoIQfBtpRMw&s", "https://www.quora.com"));
        listItems.add(new BigIcon("Telegram", "https://cdn3.iconfinder.com/data/icons/social-media-chamfered-corner/154/telegram-512.png", "https://telegram.org"));
        listItems.add(new BigIcon("Viber", "https://static.vecteezy.com/system/resources/previews/023/986/573/original/viber-logo-viber-logo-transparent-viber-icon-transparent-free-free-png.png", "https://www.viber.com"));
        listItems.add(new BigIcon("LINE", "https://static.vecteezy.com/system/resources/previews/023/986/611/non_2x/line-app-logo-line-app-logo-transparent-line-app-icon-transparent-free-free-png.png", "https://line.me"));
        listItems.add(new BigIcon("Clubhouse", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJHlul597Xpb5x3USgHbrxwAhJC15YnvswqA&s", "https://www.joinclubhouse.com"));
        listItems.add(new BigIcon("Discord", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ10rPiqQn7hN6eGiuB-UUYyerDiN7SiHpOWQ&s", "https://www.discord.com"));
        listItems.add(new BigIcon("Signal", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBRpLsv5BkLsR4eDe5bVGpyAGXFDgY0SGkCw&s", "https://www.signal.org"));
        listItems.add(new BigIcon("Medium", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQowM3PIgYobhX2HUBt4o4ce4s-zbrcMk7jBA&s", "https://www.medium.com"));
    }
    }
