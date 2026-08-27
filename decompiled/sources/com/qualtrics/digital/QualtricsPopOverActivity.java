package com.qualtrics.digital;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.gson.Gson;
import com.qualtrics.digital.theming.prompt.MobileAppPromptTheme;
import com.qualtrics.digital.ui.EdgeToEdge;
import o.PinnableContainer;
import o.onTrimMemory;

/* JADX INFO: loaded from: classes3.dex */
public class QualtricsPopOverActivity extends AppCompatActivity implements QualtricsPopOverFragment.OnCreativeButtonPressedListener {
    private boolean autoCloseAtEndOfSurvey;
    private String mActionSetID;
    private String mAppPackageName;
    private String mCreativeID;
    private FrameLayout mFragmentContainer;
    private String mInterceptID;
    private Fragment mPlaystoreFragment;
    private String mPlaystoreURL;
    private PopOverCreative mPopOverCreative;
    private QualtricsSurveyFragment mSurveyFragment;
    private String mURL;
    protected ReviewFactoryHelper reviewFactoryHelper;

    /* JADX INFO: loaded from: classes4.dex */
    public final class CreativeButtonActionKeys {
        static final String APP_REVIEWS = "appreviews";
        static final String DISMISS = "negative";
        static final String DISMISS_NAME = "dismiss";
        static final String TARGET = "positive";
        static final String TARGET_NAME = "target";

        public CreativeButtonActionKeys() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final class IntentKeys {
        static final String ACTIONSETID = "actionSetID";
        static final String AUTO_CLOSE_AT_END_OF_SURVEY = "autoCloseAtEndOfSurvey";
        static final String CREATIVE = "creative";
        static final String CREATIVEID = "creativeID";
        static final String INTERCEPTID = "interceptID";
        static final String LAYOUT_FLAGS = "layoutFlags";
        static final String URL = "url";

        public IntentKeys() {
        }
    }

    private boolean isSurveyRedirectedWithIntent() {
        return this.mSurveyFragment.performRedirectIfNeeded();
    }

    private void setColorsForLinkButtons() {
        Buttons buttons = this.mPopOverCreative.CreativeDefinition.Options.Buttons;
        if (buttons.ButtonStyle.equals("link")) {
            String str = buttons.LinkColor;
            buttons.ButtonOne.Color = str;
            buttons.ButtonTwo.Color = str;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MobileAppPromptTheme mobileAppPromptTheme;
        try {
            super.onCreate(bundle);
            onTrimMemory supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.IconCompatParcelizer(getDrawable(R.drawable.bottom_border));
                supportActionBar.serializer(0.0f);
                supportActionBar.IconCompatParcelizer();
            } else {
                QualtricsLog.logError("Support action bar is null");
            }
            getWindow().setSoftInputMode(16);
            getWindow().addFlags(getIntent().getIntExtra("layoutFlags", 0));
            setTitle(R.string.qualtrics_dialog_text);
            EdgeToEdge.enableWhenSupportedFor(this);
            this.mAppPackageName = getPackageName();
            this.mPopOverCreative = (PopOverCreative) new Gson().fromJson(getIntent().getStringExtra("creative"), PopOverCreative.class);
            this.mURL = getIntent().getStringExtra("url");
            this.mInterceptID = getIntent().getStringExtra("interceptID");
            this.mCreativeID = getIntent().getStringExtra("creativeID");
            this.mActionSetID = getIntent().getStringExtra("actionSetID");
            this.autoCloseAtEndOfSurvey = getIntent().getBooleanExtra("autoCloseAtEndOfSurvey", false);
            this.mPlaystoreURL = "https://play.google.com/store/apps/details?id=" + this.mAppPackageName;
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            this.mFragmentContainer = frameLayout;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.mFragmentContainer.setId(View.generateViewId());
            linearLayout.addView(this.mFragmentContainer);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            this.mPlaystoreFragment = QualtricsSurveyFragment.newInstance(this.mPlaystoreURL, this.mInterceptID, this.mCreativeID, this.mActionSetID, this.mAppPackageName, this.autoCloseAtEndOfSurvey);
            this.mSurveyFragment = QualtricsSurveyFragment.newInstance(this.mURL, this.mInterceptID, this.mCreativeID, this.mActionSetID, this.mAppPackageName, this.autoCloseAtEndOfSurvey);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().add(this.mFragmentContainer.getId(), this.mSurveyFragment).hide(this.mSurveyFragment).commit();
            setColorsForLinkButtons();
            ThemeApplier themeApplier = new ThemeApplier(new ThemingUtilsImpl(getApplicationContext()));
            if (themeApplier.shouldPopOverUseTheming(this.mPopOverCreative.CreativeDefinition.Options)) {
                PopOverCreativeDefinition popOverCreativeDefinition = this.mPopOverCreative.CreativeDefinition;
                popOverCreativeDefinition.Options = themeApplier.computePopOverOptionsTheming(popOverCreativeDefinition.Options, Qualtrics.instance().creativeTheme);
                mobileAppPromptTheme = Qualtrics.instance().creativeTheme.getMobileAppPromptTheme();
            } else {
                mobileAppPromptTheme = null;
            }
            fragmentManager.beginTransaction().add(this.mFragmentContainer.getId(), QualtricsPopOverFragment.newInstance(new Gson().toJson(this.mPopOverCreative), i, new Gson().toJson(mobileAppPromptTheme))).commit();
            setContentView(linearLayout);
            overridePendingTransition(android.R.anim.fade_in, 0);
            this.reviewFactoryHelper = new ReviewFactoryHelper();
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
            finish();
        }
    }

    @Override // com.qualtrics.digital.QualtricsPopOverFragment.OnCreativeButtonPressedListener
    public void onCreativeButtonPressed(String str) {
        if ((str.equalsIgnoreCase("positive") || str.equalsIgnoreCase("target")) && this.mURL != null) {
            setCustomPropertyForButtonPressed("target");
            if (isSurveyRedirectedWithIntent()) {
                this.mSurveyFragment.setWebViewShown(false);
                return;
            } else {
                getFragmentManager().beginTransaction().setCustomAnimations(android.R.animator.fade_in, 0).replace(this.mFragmentContainer.getId(), this.mSurveyFragment).show(this.mSurveyFragment).commit();
                this.mSurveyFragment.setWebViewShown(true);
                return;
            }
        }
        if (!str.equalsIgnoreCase("appreviews")) {
            finish();
            setCustomPropertyForButtonPressed("dismiss");
            return;
        }
        SiteInterceptService.instance().recordClick(this.mInterceptID, this.mCreativeID, this.mActionSetID);
        int nativeAppReviewCount = Qualtrics.instance().properties.getNativeAppReviewCount();
        if (Qualtrics.instance().properties.shouldDisplayNativeAppReviews()) {
            int i = 3;
            if (nativeAppReviewCount < 3) {
                Qualtrics.instance().properties.setNativeAppReviewCount(nativeAppReviewCount + 1);
                ReviewManager reviewManager = this.reviewFactoryHelper.getReviewManager(getApplicationContext());
                reviewManager.requestReviewFlow().addOnCompleteListener(new Qualtrics$$ExternalSyntheticLambda4(this, i, reviewManager));
                return;
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.mAppPackageName));
        intent.addFlags(1208483840);
        try {
            startActivity(intent);
            finish();
        } catch (Exception unused) {
            getFragmentManager().beginTransaction().setCustomAnimations(android.R.animator.fade_in, 0).replace(this.mFragmentContainer.getId(), this.mPlaystoreFragment).commit();
        }
        setCustomPropertyForButtonPressed("appreviews");
    }

    private void setCustomPropertyForButtonPressed(String str) {
        Qualtrics.instance().properties.setCreativeActionButtonPressed(this.mInterceptID, this.mPopOverCreative.CreativeDefinition.CreativeID, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreativeButtonPressed$0(ReviewManager reviewManager, Task task) {
        if (task.isSuccessful()) {
            reviewManager.launchReviewFlow(this, (ReviewInfo) task.getResult()).addOnCompleteListener(new PinnableContainer() { // from class: com.qualtrics.digital.QualtricsPopOverActivity.1
                @Override // o.PinnableContainer
                public void onComplete(Task task2) {
                    QualtricsPopOverActivity.this.finish();
                }
            });
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, android.R.anim.fade_out);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        overridePendingTransition(0, android.R.anim.fade_out);
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
