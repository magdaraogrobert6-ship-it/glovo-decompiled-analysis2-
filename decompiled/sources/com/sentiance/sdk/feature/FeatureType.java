package com.sentiance.sdk.feature;

import o.getConversationShortcutId;

/* JADX INFO: loaded from: classes3.dex */
public enum FeatureType {
    DATA_COLLECTOR,
    EVENT_TIMELINING,
    CRASH_DETECTION,
    LIFESTYLE,
    USER_CONTEXT,
    DRIVING_INSIGHTS,
    SMART_GEOFENCES;

    public String getArtifactName() {
        switch (getConversationShortcutId.IconCompatParcelizer[ordinal()]) {
            case 1:
                return "sdk-event-timeline";
            case 2:
                return "sdk-crash-detection";
            case 3:
                return "sdk-lifestyle";
            case 4:
                return "sdk-user-context";
            case 5:
                return "sdk-driving-insights";
            case 6:
                return "sdk-smart-geofences";
            case 7:
                return "sdk-data-collector";
            default:
                return "";
        }
    }

    public String getFeatureClassName() {
        switch (getConversationShortcutId.IconCompatParcelizer[ordinal()]) {
            case 1:
                return "EventTimelineFeature";
            case 2:
                return "CrashDetectionFeature";
            case 3:
                return "LifestyleFeature";
            case 4:
                return "UserContextFeature";
            case 5:
                return "DrivingInsightsFeature";
            case 6:
                return "SmartGeofencesFeature";
            case 7:
                return "DataCollectorFeature";
            default:
                return "";
        }
    }

    public String getFeatureTitle() {
        switch (getConversationShortcutId.IconCompatParcelizer[ordinal()]) {
            case 1:
                return "Event Timeline Creation";
            case 2:
                return "Vehicle Crash Detection";
            case 3:
                return "All Lifestyle Features";
            case 4:
                return "User's Current Context";
            case 5:
                return "Driving Insights";
            case 6:
                return "Smart Geofences";
            case 7:
                return "Data Collection";
            default:
                return "";
        }
    }

    public String getModuleClassName() {
        switch (getConversationShortcutId.IconCompatParcelizer[ordinal()]) {
            case 1:
                return "EventTimelineModule";
            case 2:
                return "CrashDetectionModule";
            case 3:
                return "LifestyleModule";
            case 4:
                return "UserContextModule";
            case 5:
                return "DrivingInsightsModule";
            case 6:
                return "SmartGeofencesModule";
            case 7:
                return "DataCollectorModule";
            default:
                return "";
        }
    }

    public Byte toThrift() {
        switch (getConversationShortcutId.IconCompatParcelizer[ordinal()]) {
            case 1:
                return (byte) 1;
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 4;
            case 5:
                return (byte) 5;
            case 6:
                return (byte) 6;
            default:
                return null;
        }
    }
}
