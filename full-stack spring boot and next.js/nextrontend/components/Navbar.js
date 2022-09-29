import { signOut, useSession } from "next-auth/react";
import Image from "next/image";

const Navbar = () => {
  const { data: session, status } = useSession();
  return (
    <div className="bg-green-800">
      <div className="h-26 px-8 flex items-center">
        <p className="text-white font-bold flex-auto">User Management System</p>
        {session && (
          <div className="flex items-center sm:space-x-2 justify-end">
            <Image alt="test of image"
              onClick={signOut}
              className="rounded-full cursor-pointer"
              src={session.user.image}
              height="30"
              width="30"
              layout="fixed"
              title="Click to Logout"></Image>
            <p className="text-white font-bold">{session?.user.name}</p>
          </div>
        )}
      </div>
    </div>
  );
};

export default Navbar;
