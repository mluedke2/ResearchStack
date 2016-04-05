package org.researchstack.skin;
public abstract class ResourceManager
{
    private static ResourceManager instance;

    public static void init(ResourceManager manager)
    {
        ResourceManager.instance = manager;
    }

    public static ResourceManager getInstance()
    {
        if(instance == null)
        {
            throw new RuntimeException(
                    "ResourceManager instance is null. Make sure to init a concrete implementation of ResearchStack in Application.onCreate()");
        }

        return instance;
    }

    public abstract int getStudyOverviewSections();

    @Deprecated
    public abstract int getLargeLogoDiseaseIcon();

    @Deprecated
    public abstract int getLogoInstitution();

    public abstract int getConsentPDF();

    public abstract int getConsentHtml();

    public abstract int getConsentSections();

    public abstract int getQuizSections();

    public abstract int getLearnSections();

    public abstract int getPrivacyPolicy();

    public abstract int getSoftwareNotices();

}