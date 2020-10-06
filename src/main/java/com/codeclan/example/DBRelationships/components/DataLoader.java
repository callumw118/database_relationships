package com.codeclan.example.DBRelationships.components;

import com.codeclan.example.DBRelationships.models.File;
import com.codeclan.example.DBRelationships.models.Folder;
import com.codeclan.example.DBRelationships.models.User;
import com.codeclan.example.DBRelationships.repositories.FileRepository;
import com.codeclan.example.DBRelationships.repositories.FolderRepository;
import com.codeclan.example.DBRelationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("Callum");
        userRepository.save(user1);

        Folder folder1 = new Folder("Folder", user1);
        folderRepository.save(folder1);

        File file1 = new File("Tis a file", "txt", 7, folder1);
        fileRepository.save(file1);
    }
}
