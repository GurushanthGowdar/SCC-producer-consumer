package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return 2 users "

    request{
        urlPath("/getsccData")
        method GET()
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
      body([[
         id:1,
         namename:"mahadeva"
      ],[id:2,namename: "shiva"]])

    }

}


