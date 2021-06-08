package org.john.arxgit.classes.git;

public interface IMergeRequest {
    String getFromBranch();
    String getIntoBranch();
    // TODO: потом нахуярить инфы из gitlab API https://docs.gitlab.com/ee/api/merge_requests.html
}
