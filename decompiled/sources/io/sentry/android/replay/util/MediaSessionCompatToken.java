package io.sentry.android.replay.util;

import android.app.Notification;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import com.foodora.courier.delivery.service.DeliveryService;
import io.sentry.SentryOptions;
import java.util.ArrayList;
import o.dispatchKeyEventYhN2O0wdefault;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaSessionCompatToken {
    public static void RemoteActionCompatParcelizer(int i, View view) {
        view.setTransitionVisibility(i);
    }

    public static Insets cp_(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void read(View view, io.sentry.android.replay.viewhierarchy.IconCompatParcelizer iconCompatParcelizer, SentryOptions sentryOptions) {
        LayoutNode root;
        if (view instanceof ViewGroup) {
            isAdapterPositionOnScreen isadapterpositiononscreen = io.sentry.android.replay.viewhierarchy.serializer.write;
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) view.getClass().getName(), (CharSequence) "AndroidComposeView", false)) {
                try {
                    Owner owner = view instanceof Owner ? (Owner) view : null;
                    if (owner != null && (root = owner.getRoot()) != null) {
                        io.sentry.android.replay.viewhierarchy.serializer.read(root, iconCompatParcelizer, true, sentryOptions);
                        return;
                    }
                } catch (Throwable th) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    io.sentry.android.replay.viewhierarchy.IconCompatParcelizer iconCompatParcelizerWrite = dispatchKeyEventYhN2O0wdefault.write(childAt, iconCompatParcelizer, sentryOptions);
                    arrayList.add(iconCompatParcelizerWrite);
                    read(childAt, iconCompatParcelizerWrite, sentryOptions);
                }
            }
            iconCompatParcelizer.write = arrayList;
        }
    }

    public static final onViewAttachedToWindowlambda0 IconCompatParcelizer(View view) {
        if (!view.isAttachedToWindow()) {
            return new onViewAttachedToWindowlambda0(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return new onViewAttachedToWindowlambda0(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return new onViewAttachedToWindowlambda0(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return new onViewAttachedToWindowlambda0(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static void serializer(DeliveryService deliveryService, Notification notification, int i) {
        if (i != 0 && i != -1) {
            deliveryService.startForeground(104, notification, i & 255);
        } else {
            deliveryService.startForeground(104, notification, i);
        }
    }
}
