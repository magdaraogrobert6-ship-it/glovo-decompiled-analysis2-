package com.roadrunner.password_rules;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.huawei.location.nlp.scan.FB;
import com.logistics.rider.glovo.R;
import java.util.List;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.IntPair;
import o.NullRequestDataException;
import o.colorToRgbaArray;
import o.getQueryParameterslambda2;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setTransactionSuccessful;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class PopulatePasswordRulesUseCaseImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final setTransactionSuccessful read;

    public PopulatePasswordRulesUseCaseImpl(setTransactionSuccessful settransactionsuccessful) {
        settransactionsuccessful.getClass();
        this.read = settransactionsuccessful;
    }

    public final List RemoteActionCompatParcelizer(String str) {
        Iterable iterableSerializer;
        int i = 2 % 2;
        setTransactionSuccessful settransactionsuccessful = this.read;
        try {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = IntPair.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            IntPair intPair = (IntPair) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdpSerializer);
            colorToRgbaArray colortorgbaarray = intPair.upperCaseRule;
            baseContentCardViewExternalSyntheticLambda0.add(new NullRequestDataException(colortorgbaarray.order, colortorgbaarray.pattern, settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_upper_case), false));
            colorToRgbaArray colortorgbaarray2 = intPair.lowerCaseRule;
            baseContentCardViewExternalSyntheticLambda0.add(new NullRequestDataException(colortorgbaarray2.order, colortorgbaarray2.pattern, settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_lower_case), false));
            colorToRgbaArray colortorgbaarray3 = intPair.digitRule;
            baseContentCardViewExternalSyntheticLambda0.add(new NullRequestDataException(colortorgbaarray3.order, colortorgbaarray3.pattern, settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_digit), false));
            colorToRgbaArray colortorgbaarray4 = intPair.specialRule;
            baseContentCardViewExternalSyntheticLambda0.add(new NullRequestDataException(colortorgbaarray4.order, colortorgbaarray4.pattern, settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_special_char), false));
            colorToRgbaArray colortorgbaarray5 = intPair.minCharRule;
            baseContentCardViewExternalSyntheticLambda0.add(new NullRequestDataException(colortorgbaarray5.order, colortorgbaarray5.pattern, settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_min_char), false));
            iterableSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
            int i2 = serializer + 31;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } catch (Throwable unused) {
            Timber.RemoteActionCompatParcelizer.write(new RuleParsingException("Failed to parse rules for custom password: jsonString ".concat(str), null));
            iterableSerializer = SQLite.read(new NullRequestDataException(2, "^(?=(?:[^A-Z]*[A-Z]){1}).*$", settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_upper_case), false), new NullRequestDataException(3, "^(?=(?:[^a-z]*[a-z]){1}).*$", settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_lower_case), false), new NullRequestDataException(4, "^(?=(?:[^\\d]*\\d){1}).*$", settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_digit), false), new NullRequestDataException(5, "^(?=(?:[^!@#$%^&*-]*[!@#$%^&*-]){1}).*$", settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_special_char), false), new NullRequestDataException(1, "^.{10,64}$", settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_rule_min_char), false));
        }
        return onContentCardDismissed.serializer(iterableSerializer, new FB(28));
    }
}
