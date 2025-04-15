package com.bms.dbapi.controller;
import com.bms.dbapi.models.AppUser;
import com.bms.dbapi.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/user")
public class AppUserController {
    @Autowired
    AppUserRepository appUserRepository;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(columnDefinition = "uuid", updatable = false)
//    private UUID id;

//    @PostMapping("/create")
//    public ResponseEntity<AppUser> createUser(@RequestBody AppUser user) {
//        AppUser savedUser = appUserRepository.save(user);
//        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
//    }
@PostMapping("/create")
public ResponseEntity createUser(@RequestBody AppUser user){
    appUserRepository.save(user);
    return new ResponseEntity(user, HttpStatus.CREATED);
}

    // http//localhost:8081/api/v1/db/user/nw1i338hfn3dd3db3d
    @GetMapping("/{userId}")
    public ResponseEntity getUserById(@PathVariable UUID userId){
        AppUser user = appUserRepository.findById(userId).orElse(null);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updateUserById(@RequestBody AppUser user){
        appUserRepository.save(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUserById(@PathVariable UUID userId) {
        appUserRepository.deleteById(userId);
        return new ResponseEntity(null, HttpStatus.NO_CONTENT);

    }
}
